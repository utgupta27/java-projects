package practical;

import java.lang.Thread;

class ThreadPriority extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadPriority obj2 = new ThreadPriority();
        ThreadPriority obj1 = new ThreadPriority();

        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);

        obj1.start();
        obj2.start();
    }
}

