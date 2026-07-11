import java.util.Scanner;

abstract class Patient {
    String name;
    double medicineCharges;
    Patient(String name, double medicineCharges) { this.name = name; this.medicineCharges = medicineCharges; }
    abstract double calculateBill();
}

class OutPatient extends Patient {
    static final double CONSULTATION_FEE = 500;
    OutPatient(String name, double medicineCharges) { super(name, medicineCharges); }
    @Override
    double calculateBill() { return CONSULTATION_FEE + medicineCharges; }
}

class InPatient extends Patient {
    static final double CONSULTATION_FEE = 500;
    static final double ROOM_CHARGE_PER_DAY = 2500;
    static final double NURSING_CHARGE_PER_DAY = 1000;
    int daysAdmitted;

    InPatient(String name, double medicineCharges, int daysAdmitted) {
        super(name, medicineCharges);
        this.daysAdmitted = daysAdmitted;
    }
    @Override
    double calculateBill() {
        return CONSULTATION_FEE + (ROOM_CHARGE_PER_DAY + NURSING_CHARGE_PER_DAY) * daysAdmitted + medicineCharges;
    }
}

public class Q6_HospitalBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();
        System.out.print("Patient type (O-OutPatient / I-InPatient): ");
        String type = sc.nextLine();
        System.out.print("Enter medicine charges: ");
        double medCharges = sc.nextDouble();

        Patient patient;
        if (type.equalsIgnoreCase("I")) {
            System.out.print("Enter number of days admitted: ");
            int days = sc.nextInt();
            patient = new InPatient(name, medCharges, days);
        } else {
            patient = new OutPatient(name, medCharges);
        }

        System.out.println("Total Hospital Bill: Rs. " + patient.calculateBill());
        sc.close();
    }
}
