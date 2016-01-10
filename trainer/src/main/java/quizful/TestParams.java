package quizful;

import java.util.Arrays;

/**
 * Created by Reshetnyak Viktor on 04.01.2016.
 * Project prof29
 * Package quizful
 */
public class TestParams {
    public static void main(String[] args){
        Base sub = new Sub();
        sub.test();

        MyClass myClass = new MyClass();
        myClass.test(new String[]{"1", "22", "333"});

        MyClass myTest = new MySubClass();
        myTest.test(new String[]{"111", "22", "3"});
    }
}

class MyClass{
    public void test(String arg[]){
        System.out.print("MyClass says: ");
        System.out.println(Arrays.toString(arg));
    }
}

class MySubClass extends MyClass{
    public void test(String arg[]){
        System.out.println("MySubClass says");
    }
}

class Base {
    public static void test() {
        System.out.println("Base.test()");
    }
}

class Sub extends Base {
    public static void test() {
        System.out.println("Sub.test()");
    }
}

class Aaaa {
    private Double x = 2D;
    public static void multX(Aaaa a, Double n) {
        a.setX(a.getX()*n);
    }
    public Double getX() { return x; }
    public void setX(Double xn) { x = xn; }
    public static void trippleValue(Double x) {
        x*=3;
    }
    public static Aaaa resetX(Aaaa a) {
        a = new Aaaa();
        return a;
    }
    public static void main(String[] args) {
        Double x = 4D;
        trippleValue(x);
        Aaaa anA = new Aaaa();
        multX(anA,x);
        resetX(anA);
        System.out.print(anA.getX());
    }
}