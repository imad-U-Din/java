import java.util.Scanner;

public class Q8_3DArrayStudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of classes: ");
        int classes = sc.nextInt();
        System.out.print("Enter number of students per class: ");
        int students = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][][] marks = new int[classes][students][subjects];

        for (int c = 0; c < classes; c++) {
            for (int s = 0; s < students; s++) {
                System.out.println("Enter marks for Class " + (c + 1) + " Student " + (s + 1) + ":");
                for (int sub = 0; sub < subjects; sub++) {
                    marks[c][s][sub] = sc.nextInt();
                }
            }
        }

        for (int c = 0; c < classes; c++) {
            for (int s = 0; s < students; s++) {
                int total = 0;
                for (int sub = 0; sub < subjects; sub++) total += marks[c][s][sub];
                System.out.println("Class " + (c + 1) + " Student " + (s + 1) + " Total Marks: " + total);
            }
        }
        sc.close();
    }
}
