package quizful.testInterface.circle;

import java.util.Formatter;

/**
 * Created by Reshetnyak Viktor on 10.01.2016.
 * Project proff29
 * Package quizful.testInterface.circle
 */
public class MainCircle {
    Formatter formatter = new Formatter();
    public static void main(String[] args) {
        Square s = new Circle(5);

        /**
         * System.out.printf("v1 is BAD!!");
         * Perimeter p1=s;
         * System.out.printf("%.3f", p1.perimeter());
        */
        System.out.print("\nv2:");
        Perimeter p2=(Perimeter)s;
        System.out.printf("%.3f", p2.perimeter());
        /***/
        System.out.print("\nv3:");
        Perimeter p3=new Circle(5);;
        System.out.printf("%.3f", p3.perimeter());

    }
}