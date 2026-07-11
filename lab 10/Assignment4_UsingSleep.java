// Assignment 4: Using sleep()
class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("NumberThread interrupted");
            }
        }
    }
}

class LetterThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("LetterThread interrupted");
            }
        }
    }
}

public class Assignment4_UsingSleep {
    public static void main(String[] args) {
        new NumberThread().start();
        new LetterThread().start();
        // Observation: Because NumberThread sleeps 500ms and LetterThread sleeps
        // 700ms, numbers will generally print more frequently and interleave
        // with letters in a roughly 500ms vs 700ms cadence.
    }
}
