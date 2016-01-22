package quiz.dao;

import quiz.domain.FormAnswerQuestion;

import java.util.List;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Project quiz
 * Package quiz.dao
 */
public interface FormAnswerQuestionDao{
    Long create(FormAnswerQuestion formAnswerQuestion);
    FormAnswerQuestion read(Long id);
    boolean update(FormAnswerQuestion formAnswerQuestion);
    boolean delete(FormAnswerQuestion formAnswerQuestion);
    List<FormAnswerQuestion> findAll();
}
