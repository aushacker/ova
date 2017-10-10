package org.acm.sjdavies.dva.web;

import java.util.ArrayList;
import java.util.List;

import org.acm.sjdavies.dva.model.Claim;
import org.acm.sjdavies.dva.model.Person;
import org.acm.sjdavies.dva.repo.ClaimRepository;
import org.acm.sjdavies.dva.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>A RESTful API for Claims.
 *
 * @author Stephen Davies
 * @since October 2017
 */
@RestController
public class ClaimController {

    @Autowired
    private ClaimRepository claimRepo;

    @Autowired
    private PersonRepository personRepo;

    @RequestMapping("/claim")
    public List<Claim> claimsForPerson(@RequestParam(value="pid", required=true) long pId) {
        System.out.println("Fetching all claims");
        Person p = personRepo.findOne(pId);
        if (p == null) {
            return new ArrayList<>();
        }

        return claimRepo.findByClaimantOrderById(p);
    }

}
