- Переключение запуска через `-Denv`:
    - `local` — локальный запуск.
    - `remote` — запуск через Selenoid.
- Выбор браузера через `-Dbrowser`:
    - `chrome`
    - `firefox`
- Настройки читаются из файлов:
    - `src/test/resources/properties/local.properties`
    - `src/test/resources/properties/remote.properties`
    -
- ## Пример Rub/Debug Configuration

clean test -Denv=local -Dbrowser=chrome -Dbrowser=128.0

## Структура конфигурации

- `src/test/java/tests/config/WebConfig.java` — интерфейс Owner для чтения ключей.
- `src/test/java/tests/config/Browser.java` — enum доступных браузеров.
- `src/test/java/tests/TestBase.java` — применение конфигурации к Selenide.

## Старт (remote через Selenoid)

### 1) Поднять Selenoid и UI

Файлы для запуска лежат в корне проекта:

- `docker-compose.yml`
- `browsers.json`

Запуск:
docker compose up -d

Проверка:

- `http://localhost:4444/status`
- `http://localhost:8080`

### 2) Скачать нужный образ браузера (если не скачан)

docker pull selenoid/vnc:chrome_128.0
