package com.btidge.Programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindMajorityElement {
    static void findMajorityElement(int []a){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }
        Set<Integer> set=map.keySet();
        int max=0,ele=0;
        for(int x:set){
            if(map.get(x)>max){
                max=map.get(x);
                ele=x;
            }
        }
        System.out.println(ele);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        findMajorityElement(a);
    }
}
