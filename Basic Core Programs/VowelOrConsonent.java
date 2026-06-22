import java.util.Scanner;
import java.util.*;
public class VowelOrConsonent {
    static  void checkConsonentOrVowel(char ch){
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;

            default:
                if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')){
                    System.out.print(ch + " is  consonent");
                }else{
                    System.out.println("Invalid input");
                }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        char ch=Character.toLowerCase(c);
        checkConsonentOrVowel(ch);
    }
}
