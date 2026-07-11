package hotel;

public class SuiteRoom implements RoomBilling {
    public double calculateBill(int days) { return days * 5000; }
}
