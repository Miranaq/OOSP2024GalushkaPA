package database;

public class DatabaseConnector {
    // Здесь будет код для подключения к базе данных
    // Для простоты, предположим, что мы просто возвращаем строку

    public Object fetchData(String key) {
        // Здесь должен быть код для выполнения запроса к базе данных
        // Например, возвращаем данные в зависимости от ключа
        switch (key) {
            case "user1":
                return "User  Data for user1";
            case "user2":
                return "User  Data for user2";
            default:
                return null; // Если данных нет
        }
    }
}
