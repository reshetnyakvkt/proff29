package quiz.dao;

import quiz.domain.Question;

import java.util.List;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Project quiz
 * Package quiz.dao
 */
public interface QuestionDao {
    Long create(Question question);
    Question read(Long id);
    boolean update(Question question);
    boolean delete(Question question);
    List<Question> findAll();
}
