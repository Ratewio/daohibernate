package com.example.daohibernate.repository;

import com.example.daohibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery(
                        "SELECT p FROM Person p WHERE LOWER(p.cityOfLiving) = LOWER(:city)",
                        Person.class
                )
                .setParameter("city", city)
                .getResultList();
    }
}
