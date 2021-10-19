package com.begin.passport1.Services;

import com.begin.passport1.Entities.Person;

import java.util.List;

public interface PersonService {
    List<Person> getListOfIssueRequest();

    Person getIssueRequest(int aadharId);

    void addIssueRequest(Person person);

    void deleteRequest(int id);
}
