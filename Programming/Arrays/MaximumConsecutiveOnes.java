package com.btidge.Programming;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumConsecutiveOnes {
    static void maximumConsecutiveOnes(int []a){
        int count=1,maximumCount=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==1 && a[i+1]==a[i]){
                count++;
                if(count>maximumCount){
                    maximumCount=count;
                }
            }else{

                count=1;
            }
        }
        System.out.print(maximumCount);
    }
    public static void main(String[] args) {
      Scanner sc=  new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i< a.length;i++){
          a[i]=sc.nextInt();
      }
      maximumConsecutiveOnes(a);

    }
}
