public class NewtonSquareRoot {

    public static double sqrt(double c) {

        double epsilon = 1e-15;

        double t = c;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (t + c / t) / 2.0;
        }

        return t;
    }

    public static void main(String[] args) {

        double c = Double.parseDouble(args[0]);

        if (c < 0) {
            System.out.println("Square root of negative number is not possible.");
            return;
        }

        System.out.println("Square Root = " + sqrt(c));
    }
}