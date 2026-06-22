package com.btidge.Programming;

import java.util.Scanner;

public class MergeTwoArrays {
	static void mergeTwoArrays(int []a,int []b) {
		int res[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			res[k++]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			res[k++]=b[i];
		}
		for(int x:res) {
			System.out.print(x + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int a[]=new int[n1];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int b[]=new int[n2];
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		mergeTwoArrays(a,b);
	}
}
