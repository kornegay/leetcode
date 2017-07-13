package easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum (int[] nums, int target){
		int [] solution = {0,0};
		
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		for (int x = 0; x < nums.length; x++){
			if (hash.containsKey(target - nums[x])){
				solution[0] = hash.get(target - nums[x]);
				solution[1] = x;
				return solution;
			}
			hash.put(nums[x],x);
		}
		return solution;
	}
	
	public static void main(String[] args) {
		int [] nums = {3,2,1,5,6,7,8,11};
		int target = 11;
		
		System.out.println(Arrays.toString(twoSum(nums,target)));
		//System.out.println(Arrays.toString(nums));

	}

}
