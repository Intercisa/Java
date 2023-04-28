package cache;

import java.util.Objects;

class FrequencyItem<K> implements Comparable<FrequencyItem<K>> {
    private final K key;
    private int count;
    private long lastTime;

    FrequencyItem(K key, long lastAccess) {
        this.key = key;
        this.lastTime = lastAccess;
    }

    public K getKey() {
        return key;
    }

    @Override
    public int compareTo(FrequencyItem other) {
        int count = Integer.compare(this.count, other.count);
        return count == 0 ? Long.compare(this.lastTime, other.lastTime) : count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getLastTime() {
        return lastTime;
    }

    public void setLastTime(long lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrequencyItem frequencyItem = (FrequencyItem) o;
        return count == frequencyItem.count &&
                lastTime == frequencyItem.lastTime &&
                key.equals(frequencyItem.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, count, lastTime);
    }

    @Override
    public String toString() {
        return "CountItem{" +
                "key=" + key +
                ", count=" + count +
                '}';
    }

}
