# DAO Layer with Hibernate

Приложение для получения пользователей из PostgreSQL по названию города с использованием Spring Boot, Hibernate и JPA.

## Технологии

- Java 25
- Spring Boot 4.1.2
- Hibernate 7.4.13
- Spring Data JPA
- PostgreSQL 18.6
- Maven

## База данных

Создайте базу данных `dao` в PostgreSQL.

Таблица `persons` создаётся автоматически при запуске приложения благодаря настройке Hibernate `ddl-auto=update`.

Структура таблицы:

| Поле | Тип |
|---|---|
| name | VARCHAR |
| surname | VARCHAR |
| age | INTEGER |
| phone_number | VARCHAR |
| city_of_living | VARCHAR |

Первичный ключ: `name`, `surname`, `age`.

## Запуск

1. Настройте подключение к PostgreSQL в `application.properties`.
2. Запустите приложение:

```bash
./mvnw spring-boot:run
```

Приложение запустится на порту `8080`.

## API

**GET** `/persons/by-city`

Параметр запроса: `city` — название города.

Пример:

```bash
curl "http://localhost:8080/persons/by-city?city=Moscow"
```

В ответ возвращается JSON-массив пользователей, проживающих в указанном городе.

## Реализация

- `Person` — JPA Entity.
- `PersonId` — составной первичный ключ.
- `PersonRepository` — DAO-слой с использованием `EntityManager`.
- `PersonController` — REST-контроллер.
