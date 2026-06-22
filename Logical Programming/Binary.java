public class Binary {

    public static String toBinary(int n) {
        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }

        while (binary.length() < 8) {
            binary = "0" + binary;
        }

        return binary;
    }

    public static int swapNibbles(int n) {
        return ((n & 0x0F) << 4) | ((n & 0xF0) >> 4);
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        System.out.println("Binary: " + toBinary(n));

        int swapped = swapNibbles(n);

        System.out.println("After Swapping Nibbles: " + swapped);
        System.out.println("Binary: " + toBinary(swapped));

        if (isPowerOfTwo(swapped))
            System.out.println(swapped + " is a Power of 2");
        else
            System.out.println(swapped + " is NOT a Power of 2");
    }
}