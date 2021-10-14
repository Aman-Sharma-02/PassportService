package com.begin.passport1.Controller;

import com.begin.passport1.Entities.Person;
import com.begin.passport1.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ValidatorController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<Person> getPersons()
    {
        return this.personService.getPersons();
    }

    @GetMapping("/person/{aadharId}")
    public Optional<Person> getPerson(@PathVariable String aadharId)
    {
        return this.personService.getPerson(Integer.parseInt(aadharId));
    }
}
