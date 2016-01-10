package quizful.inheritable;

/**
 * Created by Admin on 01.01.2016.
 */
public class MainFigura {
    public static void main(String[] args){
//        Figura triangle1 = new Triangle();
//        Triangle triangle2 = new Triangle();
//        Figura figura1 = new Figura();
        Figura rightTriangle1 = new RightTriangle();

//        System.out.println(triangle1.getPerimetr());
//        System.out.println(triangle2.getPerimetr());
//        System.out.println(figura1.getPerimetr());
        System.out.println(rightTriangle1.getPerimetr());
    }
}
