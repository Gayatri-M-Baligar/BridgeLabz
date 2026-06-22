import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrimeNumber(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%2==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrimeNumber(n)){
            System.out.print(n + " is prime number");
        }else{
            System.out.print(n + " is not prime number");
        }
    }
}
