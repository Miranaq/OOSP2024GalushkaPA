import cache.CacheManager;

public class Main {
    public static void main(String[] args) {
        CacheManager cacheManager = new CacheManager();

        // Запрос данных
        String key = "user1";
        System.out.println("Запрос данных для " + key + ": " + cacheManager.getData(key));

        // Повторный запрос данных (должен возвращать из кэша)
        System.out.println("Повторный запрос данных для " + key + ": " + cacheManager.getData(key));

        // Ждем 35 секунд, чтобы кэш устарел
        try {
            Thread.sleep(35000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Повторный запрос данных (должен снова запрашивать из базы данных)
        System.out.println("Запрос данных после истечения кэша для " + key + ": " + cacheManager.getData(key));
    }
}
