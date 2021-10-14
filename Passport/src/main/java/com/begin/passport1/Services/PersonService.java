package com.begin.passport1.Services;

import com.begin.passport1.Entities.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> getPersons();

    Optional<Person> getPerson(int aadharId);

    Person addPerson(Person person);

    Person updatePerson(Person person);

    void deletePerson(int parseInt);
}
