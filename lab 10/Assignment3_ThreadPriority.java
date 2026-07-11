// Assignment 3: Thread Priority
class PriorityThread extends Thread {
    public PriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + getName() + " | Priority: " + getPriority());
        }
    }
}

public class Assignment3_ThreadPriority {
    public static void main(String[] args) {
        PriorityThread high = new PriorityThread("HighPriority", Thread.MAX_PRIORITY);
        PriorityThread medium = new PriorityThread("MediumPriority", Thread.NORM_PRIORITY);
        PriorityThread low = new PriorityThread("LowPriority", Thread.MIN_PRIORITY);

        high.start();
        medium.start();
        low.start();

        // Note: Higher priority suggests the thread scheduler *prefers* to run
        // that thread more often, but actual execution order is platform
        // dependent and not guaranteed.
    }
}
