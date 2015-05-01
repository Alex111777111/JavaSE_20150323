package ru.javacourse.monitor;

/**
 * Created by Антон on 30.04.2015.
 */
public class Monitor
{
    private long counter;

    public synchronized void increase(String name) {
        System.out.println("Increase enter:" + name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
        System.out.println("Increase exit:" + name);
    }

    public synchronized void decrease(String name) {
        System.out.println("Decrease enter:" + name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter--;
        System.out.println("Decrease exit:" + name);
    }
}
