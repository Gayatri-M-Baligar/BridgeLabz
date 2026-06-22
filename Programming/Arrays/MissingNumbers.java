package com.btidge.Programming;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumbers {

    static void missingNumber(int[] a, int n) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        System.out.print("Missing Numbers are: ");

        for (int i = 1; i <= n; i++) {

            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n - 1];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        missingNumber(a, n);
    }
}