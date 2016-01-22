package quiz.exception;

/**
 * Created by Reshetnyak Viktor on 22.01.2016.
 * Project proff29
 * Package quiz.exception
 */
public class ModifyException extends Exception  {
    public ModifyException(String message) {
        super(message);
    }
    @Override
    public String getMessage(){
        return "Ошибка изменения!";
    }
}
