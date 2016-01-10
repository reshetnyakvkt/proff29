package quizful.inheritable;

/**
 * Created by Reshetnyak Viktor on 01.01.2016.
 * Project prof29
 * Package quizful.inheritable
 */
public class RightTriangle extends Triangle{
    public RightTriangle() {
        System.out.println("Конструктор RightTriangle");
    }

    @Override
    public String getPerimetr() {
        return "RightTriangle";
    }
}

