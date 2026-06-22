package com.btidge.Programming;

import java.util.Scanner;

public class CheckArraySortedOrNot {
    static boolean secondSmallest(int []a)
    {
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]<a[i]){
                return false;
            }
        }
        return true;
    }    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i< a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print(secondSmallest(a));
    }
}
