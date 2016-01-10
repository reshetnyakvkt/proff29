package quizful.tests01;

////v1
//class D implements AA {
//    public int a(A a, B b) {
//        return à.a() + new b.a();
//    }
//}

////v2
//class D implements AA {
//    public int a() {
//        return À.a() + B().a();
//    }
//}

//v3
class D implements AA {
    private static int a;
    {
        a = new A().a() + new B().a();
    }

    public static int getA() {
        return a;
    }

    @Override
    public int a() {
        return 0;
    }
}