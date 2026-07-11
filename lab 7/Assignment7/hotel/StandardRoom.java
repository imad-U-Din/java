package hotel;

public class StandardRoom implements RoomBilling {
    public double calculateBill(int days) { return days * 1500; }
}
