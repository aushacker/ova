package org.acm.sjdavies.dva.repo;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.acm.sjdavies.dva.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>Test out the new CRUD repository feature.
 *
 * @author Stephen Davies
 * @since October 2017
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository repository;

    @Test
    public void testFindAll() {
        List<Person> persons = repository.findAll();
        
        assertTrue(persons.size() > 0);
        assertTrue(persons.get(0).getClaims().size() > 0);
        assertTrue(persons.get(1).getClaims().size() > 0);
    }
}
