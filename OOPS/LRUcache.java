import java.util.*;
public class LRUcache<K, V> {

    private final int capacity;
    private final Map<K, V> cache;

    public LRUcache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity);
    }

    public V get(K key) {
        return cache.get(key);
    }

    public void put(K key, V value) {
        cache.put(key, value);

        if (cache.size() > capacity) {
            cache.remove(cache.entrySet().iterator().next().getKey());
        }
    }

    public static void main(String[] args) {
        LRUcache<String, String> cache = new LRUcache<>(2);
        cache.put("key1", "value1");
        cache.put("key2", "value2");
        cache.put("key3", "value3");
        String value = cache.get("key1");
        System.out.println(value);
        cache.put("key4", "value4");
        value = cache.get("key3");
        System.out.println(value); 
    }
}
