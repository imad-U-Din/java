package mainapp;

import library.FineCalculator;
import library.StudentMember;
import library.FacultyMember;
import library.ExternalMember;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter member type (Student/Faculty/External): ");
        String type = sc.next();
        System.out.print("Enter due date (yyyy-mm-dd): ");
        LocalDate dueDate = LocalDate.parse(sc.next());
        System.out.print("Enter return date (yyyy-mm-dd): ");
        LocalDate returnDate = LocalDate.parse(sc.next());

        long overdueDays = ChronoUnit.DAYS.between(dueDate, returnDate);

        FineCalculator member;
        switch (type.toLowerCase()) {
            case "student": member = new StudentMember(); break;
            case "faculty": member = new FacultyMember(); break;
            default: member = new ExternalMember(); break;
        }

        System.out.println("Overdue Days: " + Math.max(overdueDays, 0));
        System.out.println("Fine Amount: Rs. " + member.calculateFine(overdueDays));
        sc.close();
    }
}
