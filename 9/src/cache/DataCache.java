package cache;

import java.util.HashMap;
import java.util.Map;

public class DataCache {
    private final Map<String, CacheItem> cache;

    public DataCache() {
        this.cache = new HashMap<>();
    }

    public void put(String key, Object value) {
        CacheItem item = new CacheItem(value);
        cache.put(key, item);
    }

    public Object get(String key) {
        CacheItem item = cache.get(key);
        if (item != null && !item.isExpired()) {
            return item.getValue();
        }
        return null; // Возвращаем null, если элемент не найден или устарел
    }

    public void clear() {
        cache.clear(); // Очистка кэша
    }
}
