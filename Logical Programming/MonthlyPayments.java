public class MonthlyPayments {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double Y = Double.parseDouble(args[1]);
        double R = Double.parseDouble(args[2]);
        double r = R / (12 * 100.0);
        double n = 12 * Y;
        double payment = (P * r) / (1 - Math.pow(1 + r, -n));
        System.out.printf("Monthly Payment = %.2f", payment);
    }
}
