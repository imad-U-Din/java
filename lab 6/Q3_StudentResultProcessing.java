import java.util.Scanner;

abstract class Student {
    String name;
    int[] marks;
    Student(String name, int[] marks) { this.name = name; this.marks = marks; }

    int totalMarks() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }
    double percentage() { return totalMarks() / (double) marks.length; }
    abstract String calculateGrade();
}

class UGStudent extends Student {
    UGStudent(String name, int[] marks) { super(name, marks); }
    @Override
    String calculateGrade() {
        double p = percentage();
        if (p >= 80) return "A";
        else if (p >= 70) return "B";
        else if (p >= 60) return "C";
        else return "D";
    }
}

class PGStudent extends Student {
    PGStudent(String name, int[] marks) { super(name, marks); }
    @Override
    String calculateGrade() {
        double p = percentage();
        if (p >= 85) return "A";
        else if (p >= 75) return "B";
        else if (p >= 65) return "C";
        else return "D";
    }
}

public class Q3_StudentResultProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student type (UG/PG): ");
        String type = sc.nextLine();

        int[] marks = new int[5];
        System.out.println("Enter marks in 5 subjects:");
        for (int i = 0; i < 5; i++) marks[i] = sc.nextInt();

        Student student = type.equalsIgnoreCase("UG") ? new UGStudent(name, marks) : new PGStudent(name, marks);

        System.out.println("Total Marks: " + student.totalMarks());
        System.out.println("Percentage: " + student.percentage() + "%");
        System.out.println("Grade: " + student.calculateGrade());
        sc.close();
    }
}
