package quizful;

/**
 * Created by Admin on 24.12.2015.
 */
public class TestInterface {
    public static void main(String[] args){

    }

    static class A implements AA {
        public int a() {
            return 1;
        }
    }

    static class B implements AA {
        public int a() {
            return 1;
        }
    }

    class D implements AA {
        public int a() {
            return new A().a() + new B().a();
        }
    }
}

interface AA {
    int a();
}

