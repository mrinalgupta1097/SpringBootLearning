package com.mrinalgupta.sbl.controller;

import com.mrinalgupta.sbl.entity.Person;
import com.mrinalgupta.sbl.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class CentralController {
    PersonService personService;

    public CentralController(PersonService personService) {
        this.personService = personService;
    }

    //    get
//    post
    @PostMapping("/person")
    public String save(@RequestBody Person person) {
        return personService.save(person);
    }

//    put
//    delete


}
