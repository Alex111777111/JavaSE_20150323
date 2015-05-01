package ru.javacourse.deadlock;

/**
 * Created by Антон on 30.04.2015.
 */
public class MonitorThreadMain
{
    public static void main(String[] args) {
        MonitorA ma1 = new MonitorA();
        MonitorB mb1 = new MonitorB();
        ma1.setMonitorB(mb1);
        mb1.setMonitorA(ma1);

        ThreadA ta = new ThreadA(ma1);
        ThreadB tb = new ThreadB(mb1);
        ta.start();
        tb.start();
    }
}

class ThreadA extends Thread {

    private MonitorA monitor;

    public ThreadA(MonitorA monitor) {
        this.monitor = monitor;
    }

    public void run() {
        monitor.callMonitorB();
    }
}

class ThreadB extends Thread {

    private MonitorB monitor;

    public ThreadB(MonitorB monitor) {
        this.monitor = monitor;
    }

    public void run() {
        monitor.callMonitorA();
    }
}
