package org.acm.sjdavies.dva.repo;

import java.util.List;

import org.acm.sjdavies.dva.model.Claim;
import org.acm.sjdavies.dva.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Stephen Davies
 * @since October 2017
 */
public interface ClaimRepository extends JpaRepository<Claim, Long> {

    List<Claim> findByClaimantOrderById(Person p);
}
