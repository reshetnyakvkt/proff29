package quiz.service;

import quiz.exception.AuthenticationException;

/**
 * Created by Reshetnyak Viktor on 21.01.2016.
 * Package quiz.service
 */
public interface AuthenticationService {
    boolean authenticate(String login) throws AuthenticationException;
    void fill();
}
