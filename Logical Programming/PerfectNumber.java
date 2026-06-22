import java.util.Scanner;

public class PerfectNumber {
    static int perfectNumber(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int perfect=perfectNumber(n);
        if(perfect==n){
            System.out.print(n + " is perfect Number");
        }else{
            System.out.print(n + " is not perfect Number");
        }
    }
}
