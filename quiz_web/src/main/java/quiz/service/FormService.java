package quiz.service;

import quiz.domain.Form;

import java.util.List;

/**
 * Created by Reshetnyak Viktor on 20.01.2016.
 * Package quiz.service
 */
public interface FormService {
    Long create(Form form);
    List<Form> findAll();
    Form read(Long id);
}
