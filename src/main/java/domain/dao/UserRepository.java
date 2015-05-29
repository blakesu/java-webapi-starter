package domain.dao;

import domain.dbmodel.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by bsu on 2015/5/28.
 */

@Repository
public class UserRepository {

    @Resource
    private SqlSession sqlSession;

    public List<User> getAllUsers(){

        return sqlSession.selectList("domain.dbmodel.Mapper.getUser");

    }
}
