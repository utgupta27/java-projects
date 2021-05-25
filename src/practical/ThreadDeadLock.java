package practical;

import java.lang.Thread;

public class ThreadDeadLock {
    public static void main(String[] args) {
        final String resource1 = "Printer";
        final String resource2 = "Camera";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1 -> " + resource1 );

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2 -> " + resource2);
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2 -> " + resource2);

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1 -> " + resource1);
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
