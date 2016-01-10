package quizful;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 24.12.2015.
 */
public class TestHashMap {
    public String name;

    public int hashCode(){
//        return name.hashCode();
        return 4;
    }

    public boolean equals(Object o){
        if(o instanceof TestHashMap){
            return name.equals( ((TestHashMap)o).name );
        }
        return false;

    }

    public static void main(String[] args) {
        Map<TestHashMap, Integer> map = new HashMap<>();
        TestHashMap a1 = new TestHashMap();
        TestHashMap a2 = new TestHashMap();
        a1.name="one";

        map.put(a1, 1);

        a1.name="two";

        a2.name="one";
        map.put(a2, 2);

        System.out.println(map);
        System.out.println(map.get(a1));
        System.out.println(map.get(a2));
    }

    @Override
    public String toString() {
        return "TestHashMap{" +
                "name='" + name + '\'' +
                '}';
    }
}
