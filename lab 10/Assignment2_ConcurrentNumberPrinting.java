// Assignment 2: Concurrent Number Printing
class AllNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

class EvenNumbers extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(getName() + ": " + i);
        }
    }
}

class OddNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class Assignment2_ConcurrentNumberPrinting {
    public static void main(String[] args) {
        AllNumbers t1 = new AllNumbers();
        EvenNumbers t2 = new EvenNumbers();
        OddNumbers t3 = new OddNumbers();

        t1.setName("Thread-1(1-20)");
        t2.setName("Thread-2(Even)");
        t3.setName("Thread-3(Odd)");

        t1.start();
        t2.start();
        t3.start();

        // Explanation: Since all three threads run concurrently and are scheduled
        // by the JVM/OS thread scheduler, the exact interleaving of output lines
        // is non-deterministic and may differ across runs. Each thread's own
        // numbers will always print in order, but the three streams interleave.
    }
}
