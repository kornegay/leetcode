package easy;

import java.util.HashMap;

public class MajorityElement {

	public static int majorityElement(int[] nums){
		
		if (nums.length <= 2) return nums[0];
		
		if (nums.length == 3){
			if (nums[0] == nums[1]) return nums[0]; else return nums[2];
		}
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int temp = 0;
		
		for (int i = 0; i < nums.length; i++){
			if (hm.get(nums[i]) == null){
				hm.put(nums[i], 1);
			}else if (hm.get(nums[i]) > nums.length / 2) {
				return nums[i];
			} else {
				temp = hm.get(nums[i]) + 1;
                
                hm.put(nums[i], temp);
                
                if (hm.get(nums[i]) > nums.length / 2) return nums[i];
			}
		}
		
		System.out.println(hm.toString());
		
		return -1;
	}
	
	public static void main(String[] args) {
		//int nums[] = {1,2,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,6,7,7,8,8,8,9,10,11};
		int nums [] = {6,6,6,7,7};
		
		System.out.println(majorityElement(nums));

	}

}
