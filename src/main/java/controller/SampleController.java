package controller;

import domain.DomainFacade;
import domain.dbmodel.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@Scope("prototype")
public class SampleController {

    final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Resource
    private DomainFacade domainFacade;

    @RequestMapping("/users")
    public List<User> users() {

        logger.info("call /users");
        return domainFacade.getUsers();
    }

}