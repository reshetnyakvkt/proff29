package quiz.service;

import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import quiz.dao.*;
import quiz.exception.AuthenticationException;
import java.util.Locale;

/**
 * Created by Reshetnyak Viktor on 21.01.2016.
 * Package quiz.service
 */
@Service("authenticationService")
@Transactional
public class AuthenticationServiceImpl implements AuthenticationService {
    public static final Logger log = Logger.getLogger(AuthenticationServiceImpl.class);

    @Autowired(required = true)
    private FormDao formDao;

    @Autowired(required = true)
    private FormAccessDao formAccessDao;

    @Autowired(required = true)
    private UserDao userDao;

    public AuthenticationServiceImpl() {
        Locale.setDefault(Locale.ENGLISH);
    }

    @Override
    public boolean authenticate(String login) throws AuthenticationException {
        if (login == null || login.equals("")) {
            throw new AuthenticationException();
        }
        return true;
    }

    @Override
    public void fill() {
        log.info("Start fill()-->");
        if (userDao == null) {
            log.info("fill()/ userDao is null");
        }
        if (formDao == null) {
            log.info("fill()/ formDao is null");
        }
        if (formAccessDao == null) {
            log.info("fill()/ formAccessDao is null");
        }
        log.info("<--Finish fill()");
    }
}
