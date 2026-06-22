package com.btidge.Programming;

import java.util.Scanner;

public class FindIntersectionOfTwoArrays {
    static void intersectionOfTwoArrays(int []a,int []b){
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                System.out.print(a[i] + " ");
                i++;
                j++;
            }else if(a[i]<b[j]){
                i++;
            }else{
                j++;
            }
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
        intersectionOfTwoArrays(a,b);
    }
}
