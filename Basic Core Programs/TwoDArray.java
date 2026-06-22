import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pw.print(arr[i][j] + " ");
            }
            pw.println();
        }

        pw.flush();
    }
}