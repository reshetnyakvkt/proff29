package quizful.testException.UncheckedCheckedThrowable;

import java.io.IOException;
import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * Created by Reshetnyak Viktor on 04.01.2016.
 * Project prof29
 * Package quizful.testException.UncheckedCheckedThrowable
 */
public class UglyDirtyHack {
    public static void main(String[] args) {
        getUnsafe().throwException(new IOException("This is checked exception"));
    }

    public static Unsafe getUnsafe() {
        Unsafe unsafe = null;
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            unsafe = (Unsafe) f.get(null);
        } catch (ReflectiveOperationException e) {
            System.out.println("Who cares");
        }
        return unsafe;
    }
}
