package cache;

import java.time.Instant;

public class CacheItem {
    private final Object value;
    private final Instant timestamp;
    private static final long EXPIRATION_TIME = 30000; // Время жизни кэша в миллисекундах (30 секунд)

    public CacheItem(Object value) {
        this.value = value;
        this.timestamp = Instant.now();
    }

    public Object getValue() {
        return value;
    }

    public boolean isExpired() {
        return Instant.now().isAfter(timestamp.plusMillis(EXPIRATION_TIME));
    }
}
