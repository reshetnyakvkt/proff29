package session2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by 1 on 20.12.2015.
 */
public class ComparEx {
    public static void main(String[] args){
//        Set<User> users = new TreeSet<>();
        Set<User> users = new TreeSet<>(new LoginAsComparator());
        users.add(new User("1", "1"));
        users.add(new User("2", "22"));
        users.add(new User("3", "333"));

        System.out.println(users);
    }
}

class LoginAsComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getLogin().compareTo(o2.getLogin());
    }
}