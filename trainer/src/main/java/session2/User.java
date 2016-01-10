package session2;

import java.util.HashSet;
import java.util.Set;

public class User implements Comparable<User>{
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return !(password != null ? !password.equals(user.password) : user.password != null);
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(User o) {
        return o.getPassword().length() - this.getPassword().length();
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                '}';
    }
}

class Auth{
    Set<User> users = new HashSet<>() ;

    boolean isAuthenticated(String login, String password){
        if (login == null || password == null) return false;
        return users.contains(new User(login, password));
    }
}