package com.btidge.Programming;

import java.util.Scanner;

public class MoveZerosToTheEnd {
	static void moveZerosToEnd(int a[]) {
		int i=0,j=0;
		while(i<a.length) {
			if(a[i]!=0) {
				a[j++]=a[i++];
			}else {
				i++;
			}
		}
		while(j<a.length) {
			a[j++]=0;
		}
		
		for(int l=0;l<a.length;l++) {
			System.out.print(a[l]+ " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		moveZerosToEnd(a);
	}
}
