package com.btidge.Programming;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {

    static void threeSum(int[] a) {

        Arrays.sort(a);

        for(int i = 0; i < a.length - 2; i++) {

            // skip duplicate first elements
            if(i > 0 && a[i] == a[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = a.length - 1;

            while(left < right) {

                int sum = a[i] + a[left] + a[right];

                if(sum == 0) {

                    System.out.println(
                            "[" + a[i] + "," + a[left] + "," + a[right] + "]"
                    );

                    left++;
                    right--;

                    // skip duplicate left values
                    while(left < right && a[left] == a[left - 1]) {
                        left++;
                    }

                    // skip duplicate right values
                    while(left < right && a[right] == a[right + 1]) {
                        right--;
                    }
                }

                else if(sum < 0) {
                    left++;
                }

                else {
                    right--;
                }
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

        threeSum(a);
    }
}