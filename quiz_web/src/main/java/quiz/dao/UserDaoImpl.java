package quiz.dao;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import quiz.domain.*;

import java.util.List;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Project quiz
 * Package quiz.dao
 */
@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {
    private static Logger log = Logger.getLogger(FormDaoImpl.class);

    @Autowired(required = true)
    private SessionFactory factory;

    public UserDaoImpl() {
    }

    @Override
    public Long create(User user) {
        return (Long) factory.getCurrentSession().save(user);
    }

    @Override
    public User read(Long id) {
        return (User) factory.getCurrentSession().get(User.class, id);
    }

    @Override
    public boolean update(User user) {
        try{
            factory.getCurrentSession().update(user);
            return true;
        } catch (Exception ex){
            log.info(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(User user) {
        try{
            factory.getCurrentSession().delete(user);
            return true;
        } catch (Exception ex){
            log.info(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<User> findAll() {
        return factory.getCurrentSession().createQuery("FROM User").list();
    }
}
