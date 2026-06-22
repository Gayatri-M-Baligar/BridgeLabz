package com.btidge.Programming;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionOfTwoArrays {
    static  void unionOfTwoArrays(int []a,int []b){
        Set<Integer> set=new LinkedHashSet<>();
       for(int x:a){
           set.add(x);
       }
       for(int x:b){
           set.add(x);
       }
       for(int x:set){
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
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        unionOfTwoArrays(a,b);
    }
}
