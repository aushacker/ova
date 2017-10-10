package org.acm.sjdavies.dva.web;

import java.util.List;

import org.acm.sjdavies.dva.model.Person;
import org.acm.sjdavies.dva.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>A RESTful api to read Persons.
 *
 * @author Stephen Davies
 * @since October 2017
 */
@RestController
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @RequestMapping("/person")
    public List<Person> allPersons() {
        System.out.println("Fetching all persons");
        return repository.findAll();
    }
}
