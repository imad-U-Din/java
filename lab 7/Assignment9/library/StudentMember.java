package library;

public class StudentMember implements FineCalculator {
    public double calculateFine(long overdueDays) { return overdueDays > 0 ? overdueDays * 2 : 0; }
}
