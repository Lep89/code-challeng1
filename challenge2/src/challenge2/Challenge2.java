package challenge2;

public class Challenge2 {
	
	String StringReverse(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = s.length();i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	boolean isPalindrome(String s) {
		return s.equals(StringReverse(s));
	}

}
