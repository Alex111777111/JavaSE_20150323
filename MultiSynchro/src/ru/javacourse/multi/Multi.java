package ru.javacourse.multi;

/**
 * Created by Антон on 30.04.2015.
 */
public class Multi
{
    private int counter1;
    private int counter2;

    private Object synch1 = new Object();
    private Object synch2 = new Object();

    public void increase1() {
        synchronized(synch1) {
            counter1++;
        }
    }

    public void decrease1() {
        synchronized(synch1) {
            counter1--;
        }
    }

    public void increase2() {
        synchronized(synch2) {
            counter2++;
        }
    }

    public void decrease2() {
        synchronized(synch2) {
            counter2--;
        }
    }

}
