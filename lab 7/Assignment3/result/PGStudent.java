package result;

public class PGStudent implements Result {
    public String calculateGrade(double percentage) {
        if (percentage >= 85) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 65) return "C";
        else return "D";
    }
}
