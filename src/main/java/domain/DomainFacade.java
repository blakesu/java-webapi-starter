package domain;

import domain.dao.UserRepository;
import domain.dbmodel.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by bsu on 2015/5/25.
 */

@Service
public class DomainFacade {

    @Resource
    private UserRepository userRepository;

    public List<User> getUsers(){

        return userRepository.getAllUsers();
    }
}
