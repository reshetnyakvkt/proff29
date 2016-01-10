package quizful.testException.testNewClass;

/**
 * Created by Reshetnyak Viktor on 04.01.2016.
 * Project prof29
 * Package quizful.testException.testNewClass
 */
public class MyException extends Exception{
    public MyException(Throwable e) {
        initCause(e);
    }
}
