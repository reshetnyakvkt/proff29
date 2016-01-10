package quizful.privateConstructor;

/**
 * Created by Reshetnyak Viktor on 01.01.2016.
 * Project prof29
 * Package quizful.privateConstructor
 *
 * Как создать объект в Java, если конструктор имеет модификатор private?
 */
public class Example {
    private static Example example = new Example();
    private Example() {
        System.out.println("Hello World");
    }

    static Example create() { return new Example();}

    public static void main(String[] args) {
        // ...
    }
}
