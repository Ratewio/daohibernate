
CREATE TABLE persons (
    name VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL,
    age INTEGER NOT NULL,
    phone_number VARCHAR(255),
    city_of_living VARCHAR(255),

    PRIMARY KEY (name, surname, age)
);
