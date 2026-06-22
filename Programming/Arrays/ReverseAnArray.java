package com.btidge.Programming;

import java.util.Scanner;

public class ReverseAnArray {
	static void reverseAnArray(int []a) {//1 2 3 4 5 
		int start=0,end=a.length-1;
		while(start<end) {
			a[start]=a[start]+a[end];//6
			a[end]=a[start]-a[end];//6-5=1
			a[start]=a[start]-a[end];
			start++;
			end--;
		}
		for(int x:a) {
			System.out.print(x + " ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		reverseAnArray(a);
	}
}
