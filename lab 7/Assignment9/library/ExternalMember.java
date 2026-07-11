package library;

public class ExternalMember implements FineCalculator {
    public double calculateFine(long overdueDays) { return overdueDays > 0 ? overdueDays * 5 : 0; }
}
