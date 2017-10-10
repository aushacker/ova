package org.acm.sjdavies.dva.web;

import org.acm.sjdavies.dva.repo.ClaimRepository;
import org.acm.sjdavies.dva.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>Server side listing of database tables.
 *
 * @author Stephen Davies
 * @since October 2017
 */
@Controller
public class DbDumpController {

    @Autowired
    private ClaimRepository claimRepo;
    
    @Autowired
    private PersonRepository personRepo;
    
    @RequestMapping("/dbClaims")
    public ModelAndView dbClaims() {
        ModelAndView model = new ModelAndView("claims");
        model.addObject("claims", claimRepo.findAll());

        return model;
    }
    
    @RequestMapping("/dbPersons")
    public ModelAndView dbPersons() {
        ModelAndView model = new ModelAndView("persons");
        model.addObject("persons", personRepo.findAll());

        return model;
    }
}
