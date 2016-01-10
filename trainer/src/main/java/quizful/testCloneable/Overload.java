package quizful.testCloneable;

/**
 * Created by Reshetnyak Viktor on 10.01.2016.
 * Project proff29
 * Package quizful.testCloneable
 */
public class Overload {
    public static void main(String[] args) {
        Test t=new Test();
//        t.clone();
        System.out.println(t.i);
    }
}
class Test{
    int i;
//    public clone(){
//        i=15;
//    }
}
/**
 * Пояснение: clone() - метод класса Object.
 * Во-первых, все наименования методов класса Object являются зарезервированными словами,
 * и определять свой собственный метод, название которого будет одим из этих слов - нельзя.
 * Во-вторых, сигнатура метода не соотвествует clone() из Object.
*/