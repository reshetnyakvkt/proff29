package quizful;

/**
 * Created by Admin on 24.12.2015.
 */
public class TestAbstract {
    public static void main(String[] args){
        A b = new B();
        b.print();

        C d = new D();
        d.print();


    }

    static abstract class A{
        public abstract void print();
    }

    static class B extends A{
        public void print(){
            System.out.println("B");
        }
    }

    static abstract class C extends B{
        public abstract void print();
    }

    static class D extends C{
        public void print(){
            System.out.println("D");
        }
    }

}

