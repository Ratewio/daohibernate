# DAO Hibernate — Spring Data JPA

Приложение для работы с PostgreSQL через Spring Boot, Hibernate и Spring Data JPA.

## Технологии

- Java 25
- Spring Boot 4.1.2
- Spring Data JPA
- Hibernate 7
- PostgreSQL 18
- Flyway
- Maven

## Запуск

Запустить PostgreSQL в Docker:

```bash
docker compose up -d
```

Запустить приложение:

```bash
bash ./mvnw spring-boot:run
```

Flyway автоматически создаёт таблицу `persons` и добавляет тестовые данные.

Приложение доступно по адресу `http://localhost:8080`.

## REST API

| Метод | Endpoint | Описание |
|---|---|---|
| GET | `/persons/by-city?city=Moscow` | Поиск по городу |
| GET | `/persons/under-age?age=30` | Поиск по возрасту |
| GET | `/persons/by-name-and-surname?name=Ivan&surname=Ivanov` | Поиск по имени и фамилии |

## Структура проекта

- `entity` — сущности `Person` и `PersonId`
- `repository` — Spring Data JPA репозиторий
- `controller` — REST-контроллер
- `db/migration` — SQL-миграции Flyway