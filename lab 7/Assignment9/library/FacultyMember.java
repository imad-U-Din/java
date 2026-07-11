package library;

public class FacultyMember implements FineCalculator {
    public double calculateFine(long overdueDays) { return overdueDays > 0 ? overdueDays * 1 : 0; }
}
