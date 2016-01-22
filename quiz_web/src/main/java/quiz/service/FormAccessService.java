package quiz.service;

import quiz.domain.FormAccess;

import java.util.List;

/**
 * Created by Reshetnyak Viktor on 21.01.2016.
 * Project proff29
 * Package quiz.service
 */
public interface FormAccessService {
    Long create(FormAccess formAccess);
    List<FormAccess> findAll();
    FormAccess read(Long id);
}
