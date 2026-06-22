public class PowerOf2 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        if (n < 0 || n >= 31) {
            System.out.println("Invalid Input");
            return;
        }

        int power = 1;

        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + power);
            power = power * 2;
        }
    }
}