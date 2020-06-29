package com.fdmgroup.collections.Q4;
import java.util.HashMap;
import java.util.Map;

public class CountLetterss {
	public Map<Character, Integer> getLetterCount(String str) {
		if (str == null) {
			return null;
		}

		Map<Character, Integer> letterCount = new HashMap<>();
		char[] letters = str.toCharArray();

		for (char letter : letters) {
			letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
		}

		return letterCount;
	}

}
