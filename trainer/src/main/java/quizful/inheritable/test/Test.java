package quizful.inheritable.test;

/**
 * Created by Reshetnyak Viktor on 10.01.2016.
 * Project proff29
 * Package quizful.inheritable.test
 */
class A { }
class B extends A { }
class C extends B { }

public class Test {
    public static void m(A a) {
        System.out.println("a");
    }

    public static void m(B b) {
        System.out.println("b");
    }

    public static void main(String[] args) {
        m(new C());
    }
}