package result;

public class UGStudent implements Result {
    public String calculateGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else return "D";
    }
}
