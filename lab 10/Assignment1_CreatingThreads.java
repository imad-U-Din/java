// Assignment 1: Creating Threads (extends Thread and implements Runnable)
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " (extends Thread): " + i);
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " (implements Runnable): " + i);
        }
    }
}

public class Assignment1_CreatingThreads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("ThreadA");

        Thread t2 = new Thread(new MyRunnable(), "ThreadB");

        t1.start();
        t2.start();
    }
}
