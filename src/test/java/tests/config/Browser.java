package tests.config;

public enum Browser {
    CHROME,
    FIREFOX;

    public static Browser from(String value) {
        try {
            return Browser.valueOf(value.trim().toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Неподдерживаемый браузер: " + value + ". Доступные: chrome, firefox.");
        }
    }
}
