package ru.javacourse.deadlock;

/**
 * Created by Антон on 30.04.2015.
 */
public class MonitorA
{
    private MonitorB monitor;

    public void setMonitorB(MonitorB monitor) {
        this.monitor = monitor;
    }

    public synchronized void callMe() {
        System.out.println("MonitorA is called");
    }

    public synchronized void callMonitorB() {
        System.out.println("Try call MonitorB");
        try {
            Thread.sleep(1000);
            monitor.callMe();
        } catch(Exception e) {
        }
    }

}
