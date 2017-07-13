package easy;

import java.util.Arrays;

public class RotateArray {
	
	public static int [] rotate (int [] nums, int k){
		int [] newArray = new int[nums.length];
		
		if (k >= nums.length){
			k = k % nums.length;
		}
		
		for (int i = 0; i < nums.length; i++){
			if ((i + k) >= (nums.length)){
				newArray[i + k - nums.length] = nums[i];
			}else{
				newArray[i+k] = nums[i];
			}
		}
		
		return newArray;
	}
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
		int k = 9;
		
		System.out.println(Arrays.toString(rotate(nums, k)));

	}

}
