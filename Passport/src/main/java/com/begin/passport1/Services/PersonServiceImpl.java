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
    public List<Person> getPersons()
    {

        return personDao.findAll();
    }

    @Override
    public Optional<Person> getPerson(int aadharId) {
        //return personDao.getOne(aadharId);
        Optional<Person> p= personDao.findById( aadharId);
        return p;

    }
   /* public Person getPerson(int aadharId) {
        //return personDao.getOne(aadharId);
        Optional<Person> p= personDao.findById( aadharId);
        return p;

    }*/

    @Override
    public Person addPerson(Person person) {
        personDao.save(person);
        return person;
    }

    @Override
    public Person updatePerson(Person person) {
        personDao.save(person);
        return person;
    }

    @Override
    public void deletePerson(int parseInt) {
        Person entity = personDao.getOne(parseInt);
        personDao.delete(entity);
    }
}
