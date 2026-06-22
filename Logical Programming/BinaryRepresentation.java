public class BinaryRepresentation {

    public static String toBinary(int n) {

        String binary = "";

        for (int i = 31; i >= 0; i--) {

            int power = 1 << i;

            if ((n & power) != 0) {
                binary += "1";
            } else {
                binary += "0";
            }
        }

        return binary;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        System.out.println(toBinary(n));
    }
}