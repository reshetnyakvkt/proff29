package quizful.testBooleanOp;

/**
 * Created by Admin on 31.12.2015.
 */
public class TestBool {
    public static void main(String args[]) {
        byte b = 8;
        b >>= 2;
        b <<= 2;
        int k = 2;
        int m = 10;
        int s =  1 >> k++ + ++m - --k - m-- << 1;
        System.out.println("s = " + s);
        System.out.println("k = " + k);
        System.out.println("m = " + m);
    }
}
