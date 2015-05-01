package ru.javacourse.monitor;

/**
 * Created by Антон on 30.04.2015.
 */
public class Main
{
    public static void main(String[] args) {
        Monitor m = new Monitor();
        for(int i=0; i<10; i++) {
            MonitorConsumer mc = new MonitorConsumer(m);
            mc.setName("MC_"+i);
            mc.start();
        }
    }
}
