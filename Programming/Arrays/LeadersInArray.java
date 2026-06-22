package com.btidge.Programming;

import java.util.Scanner;

public class LeadersInArray {

    static void leadersInArrays(int[] a) {

        for(int i = 0; i < a.length; i++) {

            boolean leader = true;

            for(int j = i + 1; j < a.length; j++) {

                if(a[i] <= a[j]) {
                    leader = false;
                    break;
                }
            }

            if(leader) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        leadersInArrays(a);
    }
}