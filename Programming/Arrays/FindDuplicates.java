package com.btidge.Programming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates {
	static void findDuplicates(int []a) {
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		Set<Integer> keys = map.keySet();
		for(int key:keys) {
			if(map.get(key)>1) {
				System.out.print(key + " ");
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
		findDuplicates(a);
	}
}
