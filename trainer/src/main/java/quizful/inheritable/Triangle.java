package quizful.inheritable;

/**
 * Created by Reshetnyak Viktor on 01.01.2016.
 * Project prof29
 * Package quizful.inheritable
 */
public class Triangle extends Figura {


    public Triangle() {
        System.out.println("Конструктор Triangle");
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
    }

    @Override
    public String getPerimetr(){
        return "Triangle";
    }

    class EquilateralTriangle extends Triangle{
        private double angle;

        public EquilateralTriangle() {
        }
    }
}


