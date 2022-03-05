package org.string;

public class CharOccurence {
	static String str = "welcome to chennai";

	static int occurenceOfChar(String s, char ch) {
		char[] c = s.toCharArray();
		int count = 0;
 		for (int i = 0; i < c.length; i++) {
            if(c[i] == ch) {
            	count++;
            }
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(occurenceOfChar(str, 'e'));
	}

}
