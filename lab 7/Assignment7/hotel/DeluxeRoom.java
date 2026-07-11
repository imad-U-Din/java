package hotel;

public class DeluxeRoom implements RoomBilling {
    public double calculateBill(int days) { return days * 3000; }
}
