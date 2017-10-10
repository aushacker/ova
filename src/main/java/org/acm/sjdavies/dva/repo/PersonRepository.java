package org.acm.sjdavies.dva.repo;

import org.acm.sjdavies.dva.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Stephen Davies
 * @since October 2017
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}
