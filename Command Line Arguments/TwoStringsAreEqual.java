import java.util.Scanner;

public class TwoStringsAreEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.equals(s2)){
            System.out.print("Equal");
        }else{
            System.out.print("Not Equal");
        }
    }
}
