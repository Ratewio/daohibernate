
package com.example.daohibernate.controller;

import com.example.daohibernate.entity.Person;
import com.example.daohibernate.repository.PersonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personRepository.findByCityOfLivingIgnoreCase(city);
    }

    @GetMapping("/under-age")
    public List<Person> getPersonsUnderAge(@RequestParam Integer age) {
        return personRepository.findById_AgeLessThanOrderById_AgeAsc(age);
    }

    @GetMapping("/by-name-and-surname")
    public ResponseEntity<Person> getByNameAndSurname(
            @RequestParam String name,
            @RequestParam String surname) {

        return personRepository.findById_NameAndId_Surname(name, surname)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
