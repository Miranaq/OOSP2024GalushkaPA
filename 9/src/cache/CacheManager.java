package cache;

import database.DatabaseConnector;

public class CacheManager {
    private final DataCache dataCache;
    private final DatabaseConnector databaseConnector;

    public CacheManager() {
        this.dataCache = new DataCache();
        this.databaseConnector = new DatabaseConnector();
    }

    public Object getData(String key) {
        // Сначала пытаемся получить данные из кэша
        Object cachedData = dataCache.get(key);
        if (cachedData != null) {
            return cachedData; // Возвращаем данные из кэша
        }

        // Если данных нет в кэше, запрашиваем из базы данных
        Object dataFromDb = databaseConnector.fetchData(key);
        if (dataFromDb != null) {
            dataCache.put(key, dataFromDb); // Сохраняем данные в кэш
        }
        return dataFromDb; // Возвращаем данные из базы данных или null, если данных нет
    }
}
