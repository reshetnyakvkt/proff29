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
@Repository("formDao")
@Transactional
public class FormDaoImpl implements FormDao {
    private static Logger log = Logger.getLogger(FormDaoImpl.class);

    @Autowired(required = true)
    private SessionFactory factory;

    public FormDaoImpl() {
    }

    @Override
    public Long create(Form form) {
        return (Long) factory.getCurrentSession().save(form);
    }

    @Override
    public Form read(Long id) {
        return (Form) factory.getCurrentSession().get(Form.class, id);
    }

    @Override
    public boolean update(Form form) {
        try{
            factory.getCurrentSession().update(form);
            return true;
        } catch (Exception ex){
            log.info(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Form form) {
        try{
            factory.getCurrentSession().delete(form);
            return true;
        } catch (Exception ex){
            log.info(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<Form> findAll() {
        return factory.getCurrentSession().createQuery("FROM Form").list();
    }
}
