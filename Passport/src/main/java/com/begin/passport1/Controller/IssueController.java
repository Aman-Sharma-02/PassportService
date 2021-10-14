package com.begin.passport1.Controller;

import com.begin.passport1.Entities.Person;
import com.begin.passport1.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IssueController {
    @Autowired
    private PersonService personService;

    @PostMapping(value = "/issue", consumes = "application/json")
    public Person addPerson(@RequestBody Person person) {
        return this.personService.addPerson(person);
    }



}