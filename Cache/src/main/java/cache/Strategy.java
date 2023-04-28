package cache;

import java.util.Map;
import java.util.Set;
public interface Strategy<K,V> {
    void put(K key, V value);
    V get(K key);
    Set<Map.Entry<K, V>> getAll();
    Map<K, V> getCache();
    int size();
}
