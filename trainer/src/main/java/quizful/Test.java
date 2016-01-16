package quizful;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 24.12.2015.
 */
public class Test {


    //    public static void main(String[] args) {
    public static void main(String\u005B\u005D args) { // 2
        System.out.println("-------");
        float f = 123.45678f;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        System.out.println(numberFormat.format(f));
        //
        System.out.println("-------");
        Integer aa = 128;
        Integer bb = 128;
        Integer cc = -128;
        Integer dd = -128;
        System.out.println(aa == bb);
        System.out.println(cc == dd);
        //
        System.out.println("-------");
        byte i = 6, j = 0 ;
        j += i++; i >>= 1;  System.out.print(--j);
        j += i++; i >>= 1;  System.out.print(--j);
        j += i++; i >>= 1;  System.out.print(--j);
        j += i++; i >>= 1;  System.out.print(--j);
        j += i++; i >>= 1;  System.out.print(--j);
        j += i++; i >>= 1;  System.out.print(--j);
        j += i++; i >>= 1;  System.out.print(--j);
        j += i++; i >>= 1;  System.out.print(--j);
        j += i++; i >>= 1;  System.out.print(--j);
        j += i++; i >>= 1;  System.out.print(--j);
//        for (byte i = 6, j = 0 ; (j += i++) <= 10; i >>= 1, System.out.print(--j));
        //
        System.out.println("-------");
        char a = '\u005B'; // 3
        char c = '\u005D'; // 4
        System.out.println(a * c); // 5
        //
        System.out.println("-------");
        long l = 0;
        String s = new String();
        s = "" + l;
        System.out.println(s);
        s = Long.toString(l);
        System.out.println(s);
        //
        System.out.println("-------");
        char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1 + c2);
        System.out.println(c2 + c3);
        System.out.println(c1 + c2 + c3);
        //
        System.out.println("-------");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);
        Integer[] array = null;
        list.toArray(array);
        System.out.println(list.get(1));
    }
}


