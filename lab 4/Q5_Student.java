import java.util.Scanner;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) { this.name = name; this.marks = marks; }

    int total() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }

    double percentage() { return total() / (double) marks.length; }

    char grade() {
        double p = percentage();
        if (p >= 90) return 'A';
        else if (p >= 75) return 'B';
        else if (p >= 60) return 'C';
        else if (p >= 40) return 'D';
        else return 'F';
    }

    String failedSubjects() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40) sb.append("Subject").append(i + 1).append(" ");
        }
        return sb.length() == 0 ? "None" : sb.toString();
    }
}

public class Q5_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            int[] marks = new int[5];
            System.out.println("Enter marks in 5 subjects:");
            for (int j = 0; j < 5; j++) marks[j] = sc.nextInt();
            students[i] = new Student(name, marks);
        }

        // Sort by total marks descending to determine rank
        Student[] ranked = students.clone();
        for (int i = 0; i < ranked.length - 1; i++) {
            for (int j = i + 1; j < ranked.length; j++) {
                if (ranked[j].total() > ranked[i].total()) {
                    Student temp = ranked[i]; ranked[i] = ranked[j]; ranked[j] = temp;
                }
            }
        }

        for (Student s : students) {
            int rank = 1;
            for (Student r : ranked) {
                if (r == s) break;
                rank++;
            }
            System.out.println("\nStudent: " + s.name);
            System.out.println("Total: " + s.total() + " Percentage: " + s.percentage() + "% Grade: " + s.grade());
            System.out.println("Failed Subjects: " + s.failedSubjects());
            System.out.println("Class Rank: " + rank);
        }
        sc.close();
    }
}
