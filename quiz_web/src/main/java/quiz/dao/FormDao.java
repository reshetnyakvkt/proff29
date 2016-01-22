package quiz.dao;

import quiz.domain.Form;

import java.util.List;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Project quiz
 * Package quiz.dao
 */

public interface FormDao{
    Long create(Form form);
    Form read(Long id);
    boolean update(Form form);
    boolean delete(Form form);
    List<Form> findAll();
}
