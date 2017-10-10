package org.acm.sjdavies.dva.repo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.acm.sjdavies.dva.model.Claim;
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
public class ClaimRepositoryTest {

    @Autowired
    private ClaimRepository claimRepo;

    @Autowired
    private PersonRepository personRepo;

    @Test
    public void testFindAll() {
        List<Claim> claims = claimRepo.findAll();
        
        assertTrue(claims.size() > 0);
    }

    @Test
    public void testFindByClaimantOrderById() {
        // All claims for Betty Rubble
        Person p = personRepo.findOne(1L);
        List<Claim> claims = claimRepo.findByClaimantOrderById(p);
        
        assertEquals(2, claims.size());
    }
}
