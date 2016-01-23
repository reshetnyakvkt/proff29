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
@Repository("formAnswerQuestionDao")
@Transactional
public class FormAnswerQuestionDaoImpl implements FormAnswerQuestionDao {
    private static Logger log = Logger.getLogger(FormAnswerQuestionDaoImpl.class);

    @Autowired(required = true)
    private SessionFactory factory;

    public FormAnswerQuestionDaoImpl() {
    }

    @Override
    public Long create(FormAnswerQuestion formAnswerQuestion) {
        return (Long) factory.getCurrentSession().save(formAnswerQuestion);
    }

    @Override
    public FormAnswerQuestion read(Long id) {
        return (FormAnswerQuestion) factory.getCurrentSession().get(FormAnswerQuestion.class, id);
    }

    @Override
    public boolean update(FormAnswerQuestion formAnswerQuestion) {
        try{
            factory.getCurrentSession().update(formAnswerQuestion);
            return true;
        } catch (Exception ex){
            log.info(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(FormAnswerQuestion formAnswerQuestion) {
        try{
            factory.getCurrentSession().delete(formAnswerQuestion);
            return true;
        } catch (Exception ex){
            log.info(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<FormAnswerQuestion> findAll() {
        return factory.getCurrentSession().createQuery("FROM FormAnswerQuestion").list();
    }
}
