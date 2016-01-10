package quizful;

/**
 * Created by Admin on 24.12.2015.
 */
public class TestBoolean {
    public static void main(String ... args) {
        Boolean b = new Boolean("/true");
        System.out.println(b);
    }

    public static void main(String args) {
        Boolean b = new Boolean("/false");
        System.out.println(b == false);
    }
}
