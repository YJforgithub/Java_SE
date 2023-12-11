package com.test;
import com.test.entity.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        //Integer i = 10;
        //Integer.toHexString(i);
        //String s = new String(i);
        //System.out.println(s);
        String str = "666";
        Integer i = new Integer(str);
        System.out.println(i);
        int a = 3;
        String b = new String(String.valueOf(a));
        System.out.println(b);

    }

}