import java.util.Scanner;

public class ReverseIntegerUsingFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ans=0;
        for(;n!=0;){
            ans=ans*10+n%10;
            n/=10;
        }
        System.out.print(ans);
    }
}
