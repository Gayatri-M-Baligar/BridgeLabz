import java.util.Scanner;

public class PalindromeNumber {
    static int checkPalindrome(int n){
        int rev=0;
        for(;n!=0;){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=checkPalindrome(n);
        if(n==p){
            System.out.print(n + " is Palindrome");
        }else{
            System.out.println(n + " is not palindrome");
        }
    }
}
