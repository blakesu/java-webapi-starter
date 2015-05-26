package controller;

import domain.dbmodel.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("/users")
    public List<User> users() {

        logger.info("call /users");
        List<User> lstPersons = new ArrayList<User>();

        User person = new User();
        person.setName("Tom");
        lstPersons.add(person);

        User person2 = new User();
        person2.setName("Bob");
        lstPersons.add(person2);

        return lstPersons;
    }
}