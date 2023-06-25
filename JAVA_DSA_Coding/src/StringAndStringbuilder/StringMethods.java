package StringAndStringbuilder;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Sk Suraj Ali";
        System.out.println(name.indexOf('S'));
        System.out.println(name.lastIndexOf('S'));
        System.out.println(name);
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        String str = Arrays.toString(name.toCharArray());
        System.out.println(str);
        System.out.println(Arrays.toString(name.split(" ")));
        char[] ch=name.toCharArray();
        String[] str1 = name.split(" ");
        System.out.println(ch);
    }
}
