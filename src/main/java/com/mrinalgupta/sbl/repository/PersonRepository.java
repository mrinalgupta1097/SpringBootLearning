package com.mrinalgupta.sbl.repository;

import com.mrinalgupta.sbl.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

    public String savePerson(Person person) {
        return person.getName() + " Person is saved successfully";
    }
}
