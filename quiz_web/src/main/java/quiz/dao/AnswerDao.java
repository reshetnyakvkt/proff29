package quiz.dao;

import quiz.domain.Answer;

import java.util.List;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Project quiz
 * Package quiz.dao
 */
public interface AnswerDao {
    Long create(Answer answer);
    Answer read(Long id);
    boolean update(Answer answer);
    boolean delete(Answer answer);
    List<Answer> findAll();
}
