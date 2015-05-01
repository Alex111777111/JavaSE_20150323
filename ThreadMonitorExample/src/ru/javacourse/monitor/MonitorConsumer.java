package ru.javacourse.monitor;

/**
 * Created by Антон on 30.04.2015.
 */
public class MonitorConsumer extends Thread
{
    private Monitor monitor;

    public MonitorConsumer(Monitor monitor) {
        this.monitor = monitor;
    }

    public void run() {
        for(int i=0; i<10; i++) {
            if(Math.random()>0.5) {
                monitor.increase(getName());
            } else {
                monitor.decrease(getName());
            }
        }
    }
}
