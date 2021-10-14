package com.begin.passport1.Controller;

import com.begin.passport1.Entities.Person;
import com.begin.passport1.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    private PersonService personService;



    @PutMapping(value = "/person",consumes = "application/json")
    public Person updatePerson(@RequestBody Person person)
    {
        return this.personService.updatePerson(person);
    }

    @DeleteMapping("/persons/{aadharId}")
    public ResponseEntity<HttpStatus> deletePerson(@PathVariable String aadharId)
    {
       try
       {
           this.personService.deletePerson(Integer.parseInt(aadharId));
           return new ResponseEntity<>(HttpStatus.OK);
       } catch (Exception e)
       {
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

}
