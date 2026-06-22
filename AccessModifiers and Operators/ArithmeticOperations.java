import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int res1=a+b*c;
       int res2=c+a/b;
       int res3=a%b+c;
       int res4=a*b+c;
       System.out.println(Math.min(res1,Math.min(res2,Math.min(res3,res4))));
        System.out.println(Math.max(res1,Math.max(res2,Math.max(res3,res4))));


    }
}
