package quizful.testSingleton;

/**
 * Created by Reshetnyak Viktor on 04.01.2016.
 * Project prof29
 * Package quizful.testSingleton
 */
public class MySingleton {
    private static MySingleton example = new MySingleton();

    String testField;

    private MySingleton() {
        System.out.println("Hello World");
    }

    static MySingleton create() {
        return example;
    }

    public static void main(String[] args) {
        MySingleton mySingleton1 = MySingleton.create();
        mySingleton1.testField = "1";
        MySingleton mySingleton2 = MySingleton.create();
        mySingleton2.testField = "2";
        System.out.println(mySingleton1.testField);
        System.out.println(mySingleton2.testField);

    }
}
