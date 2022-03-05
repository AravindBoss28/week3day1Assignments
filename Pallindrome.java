package org.string;

public class Pallindrome {
    static String s = "madam";
    
    static boolean checkPallindrome(String s) {
        boolean flag = false;
    	if(s.length() <= 2 ) {
    		System.out.println("please provide a proper string to check pallindrome or not");
    		return flag;
    	} else if(s.length() % 2 == 0){
    		System.out.println("to check pallindrome or not, string length should be odd");
    		return flag;
    	}else {    	   
    		for(int i = 0; i<(s.length()/2); i++) {
    			if(s.charAt(i) != s.charAt((s.length() - 1) - i)) {
    			  return flag;
    			}
       		}
            flag = true;  		
    		return flag;
    	}
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println(checkPallindrome(s));
		System.out.println(checkPallindrome("aa"));
		System.out.println(checkPallindrome("aaaaa"));
		System.out.println(checkPallindrome("malayalam"));
		
	}

}
