package com.example.daohibernate.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PersonId implements Serializable {

    private String name;
    private String surname;
    private Integer age;

    public PersonId() {
    }

    public PersonId(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonId personId = (PersonId) o;

        return java.util.Objects.equals(name, personId.name)
                && java.util.Objects.equals(surname, personId.surname)
                && java.util.Objects.equals(age, personId.age);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname, age);
    }
}
