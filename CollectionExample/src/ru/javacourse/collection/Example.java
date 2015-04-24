package ru.javacourse.collection;

import java.util.*;

public class Example
{
    public static void main(String[] args) {

        Set<Simple> col = new TreeSet<Simple>();

        col.add(new Simple("2", "2"));
        col.add(new Simple("3", "3"));
        col.add(new Simple("4", "4"));
        col.add(new Simple("1", "1"));
        col.add(new Simple("1", "1"));
        col.add(new Simple("4", "4"));

        Iterator<Simple> it = col.iterator();
        while(it.hasNext()) {
            Simple next = it.next();
            System.out.println(next);
        }

        Map<Integer, Simple> m = new TreeMap<Integer, Simple>();
        for(int i=0; i<10; i++) {
            m.put(i, new Simple("" + i, "" +i));
        }
        for(int i=0; i<10; i++) {
            m.put(i, new Simple("0_" + i, "0_" +i));
        }

        for(Integer key : m.keySet()) {
            Simple value = m.get(key);
            System.out.println(key.getClass().getSimpleName() + ":" + value.getClass().getSimpleName());
            System.out.println(key + ":" + value);
        }

        List<Simple> simples = new ArrayList<Simple>();
        for(int i=0;i<5; i++) {
            simples.add(new Simple(""+i, ""+i));
        }
        for(Simple s : simples) {
            System.out.println(s);
        }
        Collections.reverse(simples);
        System.out.println("-----------------------");
        for(Simple s : simples) {
            System.out.println(s);
        }

        Collections.sort(simples, new Comparator<Simple>() {
            @Override
            public int compare(Simple o1, Simple o2) {
                return o1.getFirst().compareTo(o2.getFirst());
            }
        });
        System.out.println("-----------------------");
        for(Simple s : simples) {
            System.out.println(s);
        }

        Collections.sort(simples, new Comparator<Simple>() {
            @Override
            public int compare(Simple o1, Simple o2) {
                return -o1.getFirst().compareTo(o2.getFirst());
            }
        });
        System.out.println("-----------------------");
        for(Simple s : simples) {
            System.out.println(s);
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

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
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
            return -this.first.compareTo(tmp.first);
        }
        throw new ClassCastException();
    }
}
