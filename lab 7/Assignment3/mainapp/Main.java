package mainapp;

import result.Result;
import result.UGStudent;
import result.PGStudent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter marks in 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            total += sc.nextInt();
        }
        double percentage = total / 5.0;

        System.out.print("Student type (UG/PG): ");
        String type = sc.next();
        Result result = type.equalsIgnoreCase("UG") ? new UGStudent() : new PGStudent();

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + result.calculateGrade(percentage));
        sc.close();
    }
}
