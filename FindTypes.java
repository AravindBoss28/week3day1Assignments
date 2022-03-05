package org.string;

public class FindTypes {
	static String test = "$$ Welcome to 2nd Class of Automation $$ ";
	static int letter = 0, space = 0, num = 0, specialChar = 0;

	static void addOccurenceCount(String s) {
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				letter++;
			}
			else if (Character.isDigit(ch[i])) {
				num++;
			}
			else if (ch[i] == ' ') {
				space++;
			} else {
				specialChar++;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addOccurenceCount(test);
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
