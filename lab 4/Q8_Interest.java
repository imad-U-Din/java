import java.util.Scanner;

class Interest {
    double principal, rate, time;
    Interest(double principal, double rate, double time) {
        this.principal = principal; this.rate = rate; this.time = time;
    }

    double simpleInterest() { return (principal * rate * time) / 100; }
    double compoundInterest() { return principal * Math.pow(1 + rate / 100, time) - principal; }
}

public class Q8_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double t = sc.nextDouble();

        Interest interest = new Interest(p, r, t);
        double si = interest.simpleInterest();
        double ci = interest.compoundInterest();

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
        System.out.println("Difference (CI - SI): " + (ci - si));
        sc.close();
    }
}
