package quizful.inheritable.myClass;

/**
 * Created by Reshetnyak Viktor on 10.01.2016.
 * Project proff29
 * Package quizful.inheritable.myClass
 */
class A {
    public A(){
        System.out.println("create A");
    }

    void prinAboutMe(){
        System.out.println("I'm class A");
    }
}
class B extends A {
    public B(){
        System.out.println("create B");
    }

    void prinAboutMe(){
        System.out.println("I'm class B");
    }
}
class C extends B {
    public C(){
        System.out.println("create C");
    }

    void prinAboutMe(){
        System.out.println("I'm class C");
    }
}
public class MyClass {
    public static void main (String args[]) {
        System.out.println("//new A() -->");
        A x1 = new A();
        System.out.println("//new B() -->");
        B x2 = new B();
        System.out.println("//new C() -->");
        C x3 = new C();
        x2 = x3;
        x1 = x3;
        x1 = x2;

//        x3 = x1;// Bad link
    }
}