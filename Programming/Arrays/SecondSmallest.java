package com.btidge.Programming;

import java.util.Scanner;

public class SecondSmallest {
    static  void secondSmallest(int []a){
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min1){
                min2=min1;
                min1=a[i];
            }else if(a[i]<min2 && a[i]!=min1){
                min2=a[i];
            }
        }
        System.out.print(min2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        secondSmallest(a);
    }
}
