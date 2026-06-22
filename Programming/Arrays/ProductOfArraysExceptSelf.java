package com.btidge.Programming;

import java.util.Scanner;

public class ProductOfArraysExceptSelf {
    static void productOfArrayExceptSelf(int []a){
        int res[]=new int[a.length];
        for(int i = 0; i < a.length; i++) {
            int prod = 1;
            for(int j = 0; j < a.length; j++) {
                if(i != j) {
                    prod *= a[j];
                }
            }
            res[i]=prod;
        }
        for(int x:res){
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        productOfArrayExceptSelf(a);
    }
}
