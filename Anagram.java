package org.string;

import java.util.Arrays;

public class Anagram {
    static String text1 = "stops";
    static String text2 = "posts";
    
    static boolean checkAnagram(String s1, String s2) {
    	char[] c1 = s1.toCharArray();
    	char[] c2 = s2.toCharArray();
    	if(c1.length != c2.length) {
    		return false;
    	}
    	Arrays.sort(c1);
    	Arrays.sort(c2);
    	return new String(c1).equals(new String(c2));
    }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(checkAnagram(text1, text2));
	}

}
