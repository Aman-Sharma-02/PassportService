package com.begin.passport1.Services;

import com.begin.passport1.Entities.Person;
import com.begin.passport1.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    public PersonServiceImpl() {

    }

    @Override
    public List<Person> getListOfIssueRequest()
    {
        return personDao.findAll();
    }

    @Override
    public Person getIssueRequest(int aadharId) {
        Optional<Person> p = personDao.findById(aadharId);
        Person person=null;
       if(p.isPresent()) {
           person = p.get();
       }
        else
        {
            throw new RuntimeException("Person record not found for AadharNumber :: "+aadharId);
        }
        return person;
    }

    @Override
    public void addIssueRequest(Person person)
    {
        int aadhar = person.getAadharNo();
        String gender = person.getGender().toUpperCase();
        int aadhar_size = String.valueOf(aadhar).length();

        if(aadhar_size == 4)
        {
            if(gender.equals("MALE") || gender.equals("FEMALE"))
            {
                this.personDao.save(person);
            }
            else
            {
                throw new RuntimeException("please enter valid gender (Male or Female) :: "+gender);
            }
        }
        else
        {
            throw new RuntimeException("Please enter valid AadharNumber (4 Digit Number) :: "+aadhar);
        }
    }

    @Override
    public void deleteRequest(int id) {
        this.personDao.deleteById(id);
    }

}
