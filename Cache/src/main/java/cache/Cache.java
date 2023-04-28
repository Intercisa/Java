package cache;
//  https://github.com/luizgustavocosta/luiz-costa-tech/blob/master/cache-eviction-policies/src/main/java/tech/costa/luiz/cache/strategy/lfu/LeastFrequentlyUsed.java

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Cache<K, V> implements Strategy<K, V> {
    private static final Logger logger = LogManager.getLogger(Cache.class);
    private final ScheduledExecutorService ses;
    private static final int MAX_SIZE = 100_000;
    private int NUMBER_OF_EVICTION = 0;
    private final int EVICTION_PERIOD = 5;
    private static final TimeUnit TIME_UNIT = TimeUnit.SECONDS;
    private final Map<K, V> cache = new ConcurrentHashMap<>();
    private final Map<K, FrequencyItem<K>> frequencyItemMap = new ConcurrentHashMap<>();

    public Cache() {
        this.ses = Executors.newScheduledThreadPool(1);
        this.ses.scheduleAtFixedRate(this::removeElement, EVICTION_PERIOD, EVICTION_PERIOD, TIME_UNIT);
    }

    @Override
    public void put(K key, V value) {
        Instant start = Instant.now();
        V v = cache.get(key);
        handleNull(key, v);
        cache.put(key, value);
        Instant end = Instant.now();
        logger.info("Execution of put in nanoseconds: " + Duration.between(start, end).getNano());
    }

    private void handleNull(K key, V v) {
        if (isNull(v)) {
            if (MAX_SIZE == cache.size()) {
                removeElement();
            }
            System.out.println("here");
            frequencyItemMap.put(key, new FrequencyItem<>(key, Clock.systemUTC().millis()));
        } else {
            addHitCount(key);
        }
    }

    @Override
    public V get(K key) {
        V value = cache.get(key);
        if (nonNull(value)) {
            Instant start = Instant.now();
            addHitCount(key);
            Instant end = Instant.now();
            logger.info("Execution of get in nanoseconds: " + Duration.between(start, end).getNano());
            return value;
        }
        return null;
    }

    @Override
    public Set<Map.Entry<K, V>> getAll() {
        return cache.entrySet();
    }

    @Override
    public Map<K, V> getCache() {
        return cache;
    }

    @Override
    public int size() {
        return cache.size();
    }

    @Override
    public String toString() {
        return "LeastFrequentlyUsed [" +
                "capacity =" + MAX_SIZE +
                ", cache =" + cache +
                ", frequencyItemMap =" + frequencyItemMap.size() +
                ']';
    }

    private void removeElement() {
        frequencyItemMap.values()
                .stream()
                .min(FrequencyItem::compareTo)
                .ifPresent(frequencyItem -> {
                    Instant start = Instant.now();
                    cache.remove(frequencyItem.getKey());
                    frequencyItemMap.remove(frequencyItem.getKey());
                    Instant end = Instant.now();
                    logger.info("Execution of remove in nanoseconds: " + Duration.between(start, end).getNano());
                    logger.info("number of evictions: " + (++NUMBER_OF_EVICTION));

                });
        logger.info("Elements in cache : " + cache);
    }

    private void addHitCount(K key) {
        var frequencyItem = frequencyItemMap.get(key);
        frequencyItem.setCount(frequencyItem.getCount() + 1);
        frequencyItem.setLastTime(Clock.systemUTC().millis());
    }
}
