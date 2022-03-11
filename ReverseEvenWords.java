package org.string;
public class ReverseEvenWords {
	static String test = "I am a software tester";

	static String reverseEvenWords(String s) {
		String[] words = s.split(" ");
		String res = "";
		for (int i = 1; i <= words.length; i++) {
			if (i % 2 == 0) {
				res +=" ";
				for (int j = words[i-1].toCharArray().length - 1; j >= 0; j--) {
					char[] ch = words[i-1].toCharArray(); 
					res += ""+ch[j];
				}
			} else {
				res = res+" " + words[i-1];	
			}		
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseEvenWords(test));
	}

}
