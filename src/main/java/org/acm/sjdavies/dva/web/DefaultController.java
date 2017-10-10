package org.acm.sjdavies.dva.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Display the index page.
 *
 * @author Stephen Davies
 * @since October 2017
 */
@Controller
public class DefaultController {

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        return "index";
    }

}