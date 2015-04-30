package ru.javacourse.srzl;

import java.io.*;

/**
 * Created by Антон on 27.04.2015.
 */
public class Example
{
    public static void main(String[] args) throws Exception {
        Simple smp = new Simple();
        smp.setFirst("FIRST");
        smp.setSecond("SECOND");
        smp.setThird("THIRD");
        smp.setName(new Other());

        FileOutputStream fos = new FileOutputStream("test.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(smp);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("test.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object t = ois.readObject();
        ois.close();
        fis.close();
        if(t instanceof Simple) {
            Simple smp1 = (Simple)t;
            System.out.println(smp1);
        }
    }
}

class Simple implements Serializable
{
    private String first;
    private String second;
    private transient String third;
    private transient Other name;

    public Other getName() {
        return name;
    }

    public void setName(Other name) {
        this.name = name;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "Simple{" + "first='" + first + ", second='" + second + ", third="+ third + '}';
    }
}

class Other {

}