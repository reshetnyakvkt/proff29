package homework01;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import session2.User;

/**
 Написать модульные тесты для класса пользователь, на методы equals и hashCode.
 Поля класса пользователь:
 1. Логин
 2. Пароль
 3. Дата регистрации
 4. Рейтинг (вещественное число)
 5. Пол
 */
public class UserTest {
    private User userX;
    private User userY;
    private User userZ;

    @Before
    public void setUp(){
        userX = new User("1", "1");
        userY = new User("1", "2");
        userZ = new User("1", "3");
    }

    @Test
    public void testHashCode(){
        boolean actualResult = false;

        if (userX.hashCode() != userX.hashCode()) {
            actualResult =  true;
        } else if (userX.equals(userY) && userX.hashCode() != userY.hashCode()) {
            actualResult =  true;
        }

        boolean expectedResult = false;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Ignore
    @Test
    public void testEquals(){
        boolean actualResult = false;

        if (! userX.equals(userX)) {
            actualResult =  true;
        } else if (userX.equals(userY)) {
            if (!userY.equals(userX)){
                actualResult =  true;
            }
        } else if (userX.equals(userY)) {
            if (userY.equals(userZ)){
                if (!userX.equals(userZ)){
                    actualResult =  true;
                }
            }
        }

        boolean expectedResult = false;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
