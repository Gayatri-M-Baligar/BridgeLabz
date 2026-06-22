package com.btidge.Programming;

import java.util.Scanner;

public class PairSumEqualsTarget {
	static void pairSumEqualsTarget(int []a,int target) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					System.out.println(a[i] + " " + a[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		pairSumEqualsTarget(a,target);
	}
}
