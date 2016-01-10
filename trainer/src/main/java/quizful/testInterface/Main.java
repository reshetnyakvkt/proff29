package quizful.testInterface;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reshetnyak Viktor on 02.01.2016.
 * Project prof29
 * Package quizful.testInterface
 */
public class Main {
    protected static int wallet;
    public static void main(String[] args){
        classA a = new classB();
        a.methodClassA();
        List<?> list = new ArrayList<Integer>();
        list.add(null);
        Test<?> testObj = new Test<Integer>();
//        Integer integer = 1;
//        testObj.test(integer);
//        testObj.test(1);
        testObj.test(null);

        Main q = new Main();
        System.out.println(q.wallet);
        System.out.println(Main.wallet);


        for (int i = 0; i < 5; i++){
            doInt(i);
        }

    }

    static int doInt(int i){
        new Main(){
            {
                System.out.println((i + 0.99) + ", ");
            }
        };
        return 0;
    }
}

class Test<T>{
    void test(T t){

    }
}