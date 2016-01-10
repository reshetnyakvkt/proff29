package quizful.inheritable;

/**
 * Created by Admin on 01.01.2016.
 */
public class Figura {
    private double p;
    static double staticDouble;

    double xPos;
    double yPos;
    double sideA;


    public String getPerimetr(){
        return "Figura";
    }

    public Figura() {
        System.out.println("Конструктор Figura");
    }
}
