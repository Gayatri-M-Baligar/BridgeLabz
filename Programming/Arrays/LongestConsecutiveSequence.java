package com.btidge.Programming;
import java.util.*;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int maxlen=0,len=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]-a[i]==1){
                len++;
                if(len>maxlen){
                    maxlen=len;
                }
            }else{
                len=1;
            }
        }
        System.out.print(maxlen);
    }
}
