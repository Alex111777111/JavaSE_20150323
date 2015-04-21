package ru.javacourse.collection;

import java.util.*;

public class Example
{
    public static void main(String[] args) {
        Set col = new TreeSet();

        col.add("2324243");
        col.add(new Simple("2", "2"));
        col.add(new Simple("3", "3"));
        col.add(new Simple("4", "4"));
        col.add(new Simple("1", "1"));
        col.add(new Simple("1", "1"));
        col.add(new Simple("4", "4"));


        List f = null;

        Object o = f.get(5);

//        for(Object obj : col) {
//            System.out.println(obj);
//        }


        Map m = new TreeMap();
        for(int i=0; i<10; i++) {
            m.put(i, new Simple("" + i, "" +i));
        }
        for(int i=0; i<10; i++) {
            m.put(i, new Simple("0_" + i, "0_" +i));
        }

        for(Object key : m.keySet()) {
            Object value = m.get(key);
            System.out.println(key.getClass().getSimpleName() + ":" + value.getClass().getSimpleName());
            System.out.println(key + ":" + value);
        }

    }
}

class Simple implements Comparable
{
    private String first;
    private String second;

    public Simple(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Simple simple = (Simple) o;

        if (!first.equals(simple.first)) return false;
        return second.equals(simple.second);

    }

    @Override
    public int hashCode() {
        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Simple{" +
                "first='" + first + ", second='" + second + '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Simple) {
            Simple tmp = (Simple)o;
            return this.first.compareTo(tmp.first);
        }
        throw new ClassCastException();
    }
}
