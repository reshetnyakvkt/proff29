package quiz.exception;

/**
 * Created by Reshetnyak Viktor on 21.01.2016.
 * Package quiz.exception
 */
public class AuthenticationException extends Exception {
    public AuthenticationException(){
    }

    public AuthenticationException(String message) {
        super(message);
    }

    @Override
    public String getMessage(){
        return "Ошибка аутентификации!";
    }
}
