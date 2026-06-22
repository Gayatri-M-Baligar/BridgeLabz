package com.btidge.Programming;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
	static void removeDuplicates(int []a) {
		Set<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.print("[");
		for(int x:set) {
			System.out.print(x + " ");
		}
		System.out.print("]");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		removeDuplicates(a);
	}
}
