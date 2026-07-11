import java.util.Scanner;

interface InterestCalculator {
    double calculateSimpleInterest(double principal, double rate, double time);
    double calculateCompoundInterest(double principal, double rate, double time);
}

class InterestImpl implements InterestCalculator {
    public double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    public double calculateCompoundInterest(double p, double r, double t) {
        return p * Math.pow(1 + r / 100, t) - p;
    }
}

public class Q2_InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter time period (years): ");
        double t = sc.nextDouble();

        InterestImpl calc = new InterestImpl();
        System.out.println("Simple Interest: " + calc.calculateSimpleInterest(p, r, t));
        System.out.println("Compound Interest: " + calc.calculateCompoundInterest(p, r, t));
        sc.close();
    }
}
