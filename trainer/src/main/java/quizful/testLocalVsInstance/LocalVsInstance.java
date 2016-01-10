package quizful.testLocalVsInstance;

/**
 * Created by Admin on 30.12.2015.
 */
public class LocalVsInstance {
    String s;

    public static void main(String[] args) {
        String s = null;
        System.out.println(s.toUpperCase());
        LocalVsInstance localVsInstance = new  LocalVsInstance();
        System.out.println(localVsInstance.s.toUpperCase());
    }
}
