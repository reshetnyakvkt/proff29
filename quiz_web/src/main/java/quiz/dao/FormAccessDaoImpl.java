package quiz.dao;

import quiz.domain.*;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import quiz.domain.FormAccess;

import java.util.List;

/**
 * Created by Reshetnyak Viktor on 21.01.2016.
 * Package quiz.dao
 */
@Repository("formAccessDao")
@Transactional
public class FormAccessDaoImpl implements FormAccessDao {
    private static Logger log = Logger.getLogger(FormAccessDaoImpl.class);

    @Autowired(required = true)
    private SessionFactory factory;

    public FormAccessDaoImpl() {
    }

    @Override
    public Long create(FormAccess formAccess) {
        return (Long) factory.getCurrentSession().save(formAccess);
    }

    @Override
    public FormAccess read(Long id) {
        return (FormAccess) factory.getCurrentSession().get(FormAccess.class, id);
    }

    @Override
    public boolean update(FormAccess formAccess) {
        try{
            factory.getCurrentSession().update(formAccess);
            return true;
        } catch (Exception ex){
            log.info(ex.getMessage());
        }
        return false;

    }

    @Override
    public boolean delete(FormAccess formAccess) {
        try{
            factory.getCurrentSession().delete(formAccess);
            return true;
        } catch (Exception ex){
            log.info(ex.getMessage());
        }
        return false;

    }

    @Override
    public List<FormAccess> findAll() {
        return factory.getCurrentSession().createQuery("FROM FormAccess").list();
    }
}
