package easy;

import java.util.Collection;
import java.util.HashMap;

public class SingleNumber {

	public static int singleNumber(int[] nums){
		HashMap <Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++){
			if (hmap.containsKey(nums[i])){
				hmap.remove(nums[i]);
			} else {
				hmap.put(nums[i], nums[i]);
			}
		}
	
		int value = (int) hmap.values().toArray()[0];
		
		
		return value;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,2,2,3,3,4,4,5};
		
		System.out.println (singleNumber(nums));
	}

}
