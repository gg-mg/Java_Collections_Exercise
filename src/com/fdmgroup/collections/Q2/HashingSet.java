package com.fdmgroup.collections.Q2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashingSet {
	
	public static void main(String[] args) {
		
	String str = "kamau kamau njoro njoro mark mark mark george george caden ann anna";
	String str1[] = str.split(" ");
	
	Set<String> setList = new  HashSet<>(Arrays.asList(str1));
	for(String s: setList) {
		System.out.println(s);
	}
	System.out.println(removeDuplicates(str1));
	}
	public static Set<String> removeDuplicates(String[] arr) {
		return new HashSet<>(Arrays.asList(arr));
	}
	
}