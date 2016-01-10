package quizful;

/**
 * Created by Admin on 24.12.2015.
 */
public class TestParam {
    static String str = "Value 1";

    public static void changeIt(String s) {
        s = "Value 2";
    }

    public static void main(String[] args) {
        changeIt(str);
        System.out.println(str);
    }
}
