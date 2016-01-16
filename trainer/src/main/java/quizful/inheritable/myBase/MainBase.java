package quizful.inheritable.myBase;

/**
 * Created by Reshetnyak Viktor on 10.01.2016.
 * Project proff29
 * Package quizful.inheritable.myBase
 */
public class MainBase {
    public static void main(String[] args){
        Sub sub = new SubMeth();
        sub.meth1();
        sub.meth2();
    }
}

abstract class Base {
    public abstract void meth1();
    public void meth2() { }
}

abstract class Sub extends Base {
    public void meth1() {
        System.out.println("Sub.meth1()");
    }
    public abstract void meth2();
}

class SubMeth extends Sub {
    @Override
    public void meth2() {
        System.out.println("SubMeth.meth2()");
    }
}