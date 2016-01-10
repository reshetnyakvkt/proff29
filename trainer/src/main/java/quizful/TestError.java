package quizful;

/**
 * Created by Admin on 24.12.2015.
 */
public class TestError {
    public static void main(String[] args){
        int i, n = 10;
        System.err.println("Version 1");
        for (i = 0; i < n; n--) {
            System.err.println("*");
        }
        //
        i = 10;
        n = 10;
        System.err.println("Version 2");
        for (i = 0; -i < n; i--) {
            System.err.println("*");
        }
    }
}
