package quiz.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import quiz.dao.FormAccessDao;
import quiz.domain.FormAccess;

import java.util.List;
import java.util.Locale;

/**
 * Created by Reshetnyak Viktor on 19.01.2016.
 * Package quiz.service
 */
@Service("formAccessService")
@Transactional
public class FormAccessServiceImpl implements FormAccessService {
    public static final Logger log = Logger.getLogger(AnswerServiceImpl.class);

    @Autowired(required = true)
    private FormAccessDao formAccessDao;

    public FormAccessServiceImpl() {
        Locale.setDefault(Locale.ENGLISH);
    }

    @Override
    public Long create(FormAccess formAccess) {
        return formAccessDao.create(formAccess);
    }

    @Override
    public List<FormAccess> findAll() {
        return formAccessDao.findAll();
    }

    @Override
    public FormAccess read(Long id) {
        return formAccessDao.read(id);
    }
}
