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
@Repository("formUserDao")
@Transactional
public class FormUserDaoImpl implements FormUserDao {
    private static Logger log = Logger.getLogger(FormUserDaoImpl.class);

    @Autowired(required = true)
    private SessionFactory factory;

    public FormUserDaoImpl() {
    }

    @Override
    public Long create(FormUser formUser) {
        return (Long) factory.getCurrentSession().save(formUser);
    }

    @Override
    public FormUser read(Long id) {
        return (FormUser) factory.getCurrentSession().get(FormUser.class, id);
    }

    @Override
    public boolean update(FormUser formUser) {
        try{
            factory.getCurrentSession().update(formUser);
            return true;
        } catch (Exception ex){
            log.info(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(FormUser formUser) {
        try{
            factory.getCurrentSession().delete(formUser);
            return true;
        } catch (Exception ex){
            log.info(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<FormUser> findAll() {
        return factory.getCurrentSession().createQuery("FROM FormUser").list();

    }
}
