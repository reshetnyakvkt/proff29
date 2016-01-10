package session2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 1 on 20.12.2015.
 */
public class MapAuth {
    private static Map<String, String> users = new HashMap<>();

    public static void main(String[] args){
        users.put("1", "1");
        users.put("2", "22");
        users.put("3", "333");

        System.out.println(isAuthenticated("1", "1"));
        System.out.println(isAuthenticated("1", "2"));
        System.out.println(isAuthenticated("1", "3"));
    }

    public static boolean isAuthenticated(String login, String pass){
        if (! users.containsValue(login)) return false;
        return users.get(login).equals(pass);
    }

    public void setUser(Map<String, String> map){
        this.users = map;
    }
}
