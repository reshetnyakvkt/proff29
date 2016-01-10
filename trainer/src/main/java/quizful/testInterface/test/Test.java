package quizful.testInterface.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reshetnyak Viktor on 04.01.2016.
 * Project prof29
 * Package quizful.testInterface.test
 */

interface I_A { public void out1(); }
interface I_B { public void out2(); }

class Impl implements I_A, I_B {     //1
    public void out2() {
        System.out.print("2");
    }
    public void out1() {
        System.out.print("1");
    }
}

public class Test extends A {


    static String[][]String = {{"String"}};

    static {
        System.out.println(String.class);
    }

    public static int j = 90;

    Test(){ j = 12; }

    public static void main(String[] args) {
        new Test();
        System.out.println(Test.j);

        List a = new ArrayList<Double>();
        a.add("1.5");
        List<Double> b = new ArrayList<>();
//        short[] x2 = [5];
        System.out.println(a + " " + b);


        System.out.println(String.class);
        /*
        Impl impl = new Impl();
        I_A a;
        a = impl;
        a.out1();
        ((I_B) a).out2();              //2
        //
        System.out.println();
        //
//        System.out.print(new Test().i);
//        System.out.print(new A().i);
//        System.out.print( ((A)new Test()).i );
        new Test().doIt();
        */
    }

    public void doIt(){

    }
}

class A {
    public int i = 2;
}
