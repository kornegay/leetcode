package easy;

public class Palindrome {

	public static boolean isPalindrome(String s){
		boolean isPal = true;
		
		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		
		if (s.isEmpty() || s.length() == 1){ 
			return true;
		}
		
		if (s.length() == 2){
            if (s.charAt(0) == s.charAt(1)) return true; else return false;
        }
		
		for (int i = 0; i <= s.length()/2; i++){
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)){

				return false;
			}
		}
		
		return isPal;
	}
	
	public static void main(String[] args) {
		String s = "rr";
		
		
		System.out.println(isPalindrome(s));

	}

}
