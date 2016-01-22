package quizful.testNull;

/**
 * Created by Reshetnyak Viktor on 18.01.2016.
 * Project proff29
 * Package quizful.testNull
 */
public class NullReferenceTest {
    static String hello(){
        return "Hello world!";
    }

    public static void main(String[] args) {
        NullReferenceTest nullReferenceTest = null;
        System.out.println(nullReferenceTest.hello());
    }
}