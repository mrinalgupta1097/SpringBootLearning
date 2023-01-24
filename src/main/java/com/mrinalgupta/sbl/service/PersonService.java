package com.mrinalgupta.sbl.service;

import com.mrinalgupta.sbl.entity.Person;
import com.mrinalgupta.sbl.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;


    public String save(Person person) {
        return personRepository.savePerson(person);
    }
}
