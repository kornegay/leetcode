package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class AnagramString {
	
	public static List<Integer> findAnagrams(String s, String p){
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i <= s.length() - p.length(); i++){
			if (check(s.substring(i, i + p.length()).toCharArray(), p.toCharArray())){
				list.add(i);
			}
		}
		
		return list;	
	}
	
	public static boolean check(char[] s, char[] p){
		String s1, p1;
		
		Arrays.sort(s);
		Arrays.sort(p);
		s1 = Arrays.toString(s);
		p1 = Arrays.toString(p);
		
		if (s1.equals(p1)) return true;
		
		return false;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(3);
		
		System.out.println (findAnagrams("abcabxyzxyz", "abc"));

	}

}
