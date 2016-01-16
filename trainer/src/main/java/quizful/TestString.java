package quizful;

/**
 * Created by Admin on 30.12.2015.
 */
public class TestString {
    public static void main(String[] args) {
        String s = new String("ssssss");
        StringBuffer sb = new StringBuffer("bbbbbb");
        s.concat("-aaa");
        sb.append("-aaa");
        System.out.println(s);
        System.out.println(sb);
        /***/
        Integer i = new Integer(10);
        if (i.toString() == i.toString()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
