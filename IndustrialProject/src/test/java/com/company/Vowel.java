package com.company;

public class Vowel {
	
	public static boolean stringConainsVowels(String input)
	{
		boolean name = input.toLowerCase().matches(".*[aeiou].*");
		
		return name;
	}

	public static void main(String[] args) {
		boolean abc=stringConainsVowels("Ahl");
		
		System.out.println(abc);
	}
}
