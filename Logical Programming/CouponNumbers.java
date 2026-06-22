import java.util.Scanner;

public class CouponNumbers {

    static int getRandom(int n) {
        return (int)(Math.random() * n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] coupons = new boolean[n];

        int distinctCoupons = 0;
        int totalRandomNumbers = 0;

        while (distinctCoupons < n) {

            int coupon = getRandom(n);
            totalRandomNumbers++;

            if (!coupons[coupon]) {
                coupons[coupon] = true;
                distinctCoupons++;
            }
        }

        System.out.println(totalRandomNumbers);
    }
}