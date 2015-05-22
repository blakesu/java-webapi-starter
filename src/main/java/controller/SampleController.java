package controller;

import dbmodel.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    @RequestMapping("/users")
    public List<User> users() {
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