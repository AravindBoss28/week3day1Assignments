package org.string;
public class ReverseEvenWords {
	static String test = "I am a software tester";

	static String reverseEvenWords(String s) {
		String[] words = s.split(" ");
		String res = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].toCharArray().length - 1; j >= 0; j--) {
				char[] ch = words[i].toCharArray();
				res = res + ch[j];
			}
			res = res + " ";
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseEvenWords(test));
	}

}
