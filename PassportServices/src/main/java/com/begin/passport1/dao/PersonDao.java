package com.begin.passport1.dao;

import com.begin.passport1.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Integer> {

}
