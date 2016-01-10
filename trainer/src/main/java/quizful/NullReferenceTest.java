package quizful;

/**
 * Created by Admin on 24.12.2015.
 */
public class NullReferenceTest {
    static {
        System.out.println("Hello world");
//        System.exit(0);
    }

    public static String helloWorld = "Hello world";

    public static String getHelloWorld(){
        return "Hello world";
    }
    //.....
    public static void main(String[] args) {
        NullReferenceTest nullReferenceTest = null;
        System.out.println(nullReferenceTest.helloWorld);
        System.out.println(nullReferenceTest.getHelloWorld());
    }
}
