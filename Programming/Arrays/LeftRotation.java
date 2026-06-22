package com.btidge.Programming;
import java.util.Arrays;
import java.util.Scanner;
public class LeftRotation {
    static void reverse(int[] a, int start, int end) {

            while(start < end) {

                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;

                start++;
                end--;
            }
        }

        static void rotateLeft(int[] a, int k) {

            int n = a.length;

            k = k % n;

            reverse(a, 0, k - 1);

            reverse(a, k, n - 1);

            reverse(a, 0, n - 1);

            System.out.println(Arrays.toString(a));
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] a =new int[n];
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            int k = sc.nextInt();

            rotateLeft(a, k);
        }
    }

