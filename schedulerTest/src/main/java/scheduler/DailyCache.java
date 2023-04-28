package scheduler;


import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

public class DailyCache {
    private final AtomicReference <ConcurrentMap< String, String >> cache;
    private final ScheduledExecutorService ses;

    public DailyCache() {
        this.cache = new AtomicReference<>(new ConcurrentHashMap<>());
        this.expensiveCalculation() ;
        this.ses = Executors.newScheduledThreadPool(1);
        this.ses.scheduleAtFixedRate(this::expensiveCalculation, 1, 10, TimeUnit.SECONDS );
    }

    public String get( String key ) {
        return this.cache.get().get( key );
    }

    public void put( String key, String value) {
        this.cache.get().put( key, value );
    }

    public void expensiveCalculation() {
//        ConcurrentMap< String, String > concurrentMap = … // An expensive operation to produce a new `ConcurrentMap`.
//        this.cache.set( concurrentMap ) ;

        System.out.println("Printed");
    }

    public void shutdown() {

    }
}
