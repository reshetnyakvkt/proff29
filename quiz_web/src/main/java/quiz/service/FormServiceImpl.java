package quiz.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import quiz.dao.FormDao;
import quiz.domain.Form;

import java.util.List;
import java.util.Locale;

/**
 * Created by Reshetnyak Viktor on 20.01.2016.
 * Package quiz.service
 */

@Service("formService")
@Transactional
public class FormServiceImpl implements FormService {
    public static final Logger log = Logger.getLogger(FormServiceImpl.class);

    @Autowired(required = true)
    private FormDao formDao;

    public FormServiceImpl() {
        Locale.setDefault(Locale.ENGLISH);
    }

    @Override
    public Long create(Form form) {
        return formDao.create(form);
    }

    @Override
    public List<Form> findAll() {
        return formDao.findAll();
    }

    @Override
    public Form read(Long id) {
        return formDao.read(id);
    }

}
