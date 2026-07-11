// Assignment 5: Thread Priority Demonstration (priorities 1 to 10)
class DemoThread extends Thread {
    public DemoThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " (priority " + getPriority() + ")");
        }
    }
}

public class Assignment5_ThreadPriorityDemonstration {
    public static void main(String[] args) {
        int[] priorities = {1, 3, 5, 7, 10};
        for (int p : priorities) {
            DemoThread t = new DemoThread("Thread-P" + p, p);
            t.start();
        }
        // Conclusion (based on repeated runs): Thread priority is only a *hint*
        // to the scheduler. On most modern JVMs/OSes, higher-priority threads
        // tend to get more CPU time on average, but there is NO guarantee that
        // higher-priority threads always execute first or finish first -
        // execution order still depends on the OS scheduler and timing.
    }
}
