package quizful;

/**
 * Created by Admin on 30.12.2015.
 */
public class TestIntegerPool {
    public static void main(String[] args){
        Integer a = 128;
        Integer b = 128;
        Integer c = -128;
        Integer d = -128;
        System.out.println(a == b);
        System.out.println(c == d);
    }
}
