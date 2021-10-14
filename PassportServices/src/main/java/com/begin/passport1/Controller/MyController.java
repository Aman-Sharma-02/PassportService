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

    @GetMapping("/home")
    public String home()
    {
        return "Passport Seva Portal \n" +
                "use @post /issue to issue a passport\n" +
                "use @get /persons to get all the records \n" +
                "use @get /person/aadharNo to get all the records \n" +
                "use @delete /delete/aadharNo to delete a record\n";
    }

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

    @PostMapping(value = "/issue",consumes = "application/json")
    public Person addPerson(@RequestBody Person person)
    {
        return this.personService.addPerson(person);
    }

    @PutMapping(value = "/update",consumes = "application/json")
    public Person updatePerson(@RequestBody Person person)
    {
        return this.personService.updatePerson(person);
    }

    @DeleteMapping("/delete/{aadharId}")
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
