import java.util.Scanner;

interface Result {
    int totalMarks(int[] marks);
    double percentage(int total, int maxTotal);
    char grade(double percentage);
}

class ResultImpl implements Result {
    public int totalMarks(int[] marks) {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }
    public double percentage(int total, int maxTotal) {
        return (total * 100.0) / maxTotal;
    }
    public char grade(double percentage) {
        if (percentage >= 90) return 'A';
        else if (percentage >= 75) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 40) return 'D';
        else return 'F';
    }
}

public class Q3_ResultInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter marks in 5 subjects (out of 100 each):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        ResultImpl result = new ResultImpl();
        int total = result.totalMarks(marks);
        double perc = result.percentage(total, 500);
        char grade = result.grade(perc);

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + perc + "%");
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
