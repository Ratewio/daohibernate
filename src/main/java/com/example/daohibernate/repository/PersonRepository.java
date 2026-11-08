
package com.example.daohibernate.repository;

import com.example.daohibernate.entity.Person;
import com.example.daohibernate.entity.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, PersonId> {

    // Поиск по городу
    List<Person> findByCityOfLivingIgnoreCase(String city);

    // Поиск людей младше указанного возраста с сортировкой по возрастанию
    List<Person> findById_AgeLessThanOrderById_AgeAsc(Integer age);

    // Поиск по имени и фамилии
    Optional<Person> findById_NameAndId_Surname(String name, String surname);
}

