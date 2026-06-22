package com.btidge.Programming;

import java.util.Scanner;

public class SecondLargest {
	
	static void secondLargest(int []a) {
		int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}else if(a[i]>max2 && a[i]!=max1) {
				max2=a[i];
			}
		}
		System.out.println(max2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		secondLargest(a);
	}
}
