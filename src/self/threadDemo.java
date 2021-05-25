package self;

import java.lang.Thread;
import java.lang.Runnable;

class MultiThreading extends Thread {
    public void run(){
        System.out.println("Thread : " + Thread.currentThread().getId());
    }
}

class MultiThreadingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread : " + Thread.currentThread().getId());
    }
}

public class threadDemo {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            Thread obj = new Thread(new MultiThreadingRunnable());
            obj.start();
        }
    }
}

//public class threadDemo {
//    public static void main(String[] args) {
//        for (int i = 0; i <10 ; i++) {
//            MultiThreading obj = new MultiThreading();
//            obj.start();
//        }
//    }
//}
