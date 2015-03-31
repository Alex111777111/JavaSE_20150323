package ru.javacourse;

import java.util.Date;

public class Simple
{
    public static void main(String[] args) {
        Date d = new Date();

        Person p1 = new Person();
        p1.setSurName("Петров");
        p1.setGivenName("Андрей");
        p1.setDateOfBirth(d);

        Person p2 = new Person();
        p2.setSurName("Петров");
        p2.setGivenName("Андрей");
        p2.setDateOfBirth(d);

        if(p1 == p2) {
            System.out.println("ONE OBJECT");
        } else {
            System.out.println("TWO OBJECTS");
        }

        if(p1.equals(p2)) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        Object o = p1;
        System.out.println(o.toString());
    }
}










