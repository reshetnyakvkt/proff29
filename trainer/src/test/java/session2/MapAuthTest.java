package session2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 1 on 20.12.2015.
 */
public class MapAuthTest {
    private MapAuth module;

    @Before
    public void setUp(){
        module = new MapAuth();
    }

    @Test
    public void testIsAuthenticated(){
        Map<String, String> users = new HashMap<>();
        users.put("1", "1");
        module.setUser(users);

        boolean actualResult = module.isAuthenticated("1", "1");
        boolean expectedResult = false;
        Assert.assertEquals(expectedResult, actualResult);
    }


}
