package quizful;

/**
 * Created by Admin on 24.12.2015.
 */
public class TestInterfaceInheritableField {
    public static void main(String[] args){
        Implementor implementor = new Implementor();

        System.out.println(((A) new Implementor()).text); //Выведет "a"
        System.out.println(((B) new Implementor()).text); //Выведет "b"
    }
}

interface A {
    String text = "a";
}

interface B {
    String text = "b";
}

class Implementor implements A, B {
    public static void main(String[] args) {
//        System.out.println(Implementor.text);
    }

}
