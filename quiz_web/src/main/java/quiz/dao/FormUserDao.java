package quiz.dao;

import quiz.domain.FormUser;

import java.util.List;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Project quiz
 * Package quiz.dao
 */
public interface FormUserDao {
    Long create(FormUser formUser);
    FormUser read(Long id);
    boolean update(FormUser formUser);
    boolean delete(FormUser formUser);
    List<FormUser> findAll();
}
