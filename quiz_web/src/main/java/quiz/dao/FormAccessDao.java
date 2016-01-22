package quiz.dao;

import quiz.domain.FormAccess;

import java.util.List;

/**
 * Created by Reshetnyak Viktor on 21.01.2016.
 * Project proff29
 * Package quiz.dao
 */
public interface FormAccessDao {
    Long create(FormAccess formAccess);
    FormAccess read(Long id);
    boolean update(FormAccess formAccess);
    boolean delete(FormAccess formAccess);
    List<FormAccess> findAll();
}
