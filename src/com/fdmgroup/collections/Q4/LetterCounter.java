package com.fdmgroup.collections.Q4;

import java.util.HashMap;
import java.util.Map;

public class LetterCounter {
	
	public static void main(String[] args){
		
		String str= "HELLO THERE";
		
		Map<Character, Integer> letterCount = new HashMap<>();
		char[] letters = str.toCharArray();

		for (char letter : letters) {
			letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
			System.out.print(letter);
			//System.out.println(letterCount.getOrDefault(letter, 0));
			System.out.print(letterCount.getOrDefault(letter, 0));
		}
		
	}

}
