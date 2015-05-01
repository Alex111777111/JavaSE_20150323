package ru.javacourse.deadlock;

/**
 * Created by Антон on 30.04.2015.
 */
public class MonitorB
{
    private MonitorA monitor;

    public void setMonitorA(MonitorA monitor) {
        this.monitor = monitor;
    }

    public synchronized void callMe() {
        System.out.println("MonitorB is called");
    }

    public synchronized void callMonitorA() {
        System.out.println("Try call MonitorA");
        try {
            Thread.sleep(1000);
            monitor.callMe();
        } catch(Exception e) {
        }
    }

}
