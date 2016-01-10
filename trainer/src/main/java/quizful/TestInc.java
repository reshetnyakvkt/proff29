package quizful;

/**
 * Created by Admin on 24.12.2015.
 */
public class TestInc {
    public static void main(String[] args){
        int i = 5;
        i = i++;
        System.out.println(i);
        //
        i = 5;
        i = i++ + i++;
        System.out.println(i);
        //
        i = 5;
        i = i++ + ++i;
        System.out.println(i);
        //
        i = 5;
        i = ++i + ++i;
        System.out.println(i);
    }
}
