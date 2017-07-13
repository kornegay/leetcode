package easy;

import java.util.Arrays;
import java.util.LinkedList;

public class MoveZeroes {

	public static void moveZeroes(int[] nums){
		int zeroCount = 0;
		
		LinkedList<String> list = new LinkedList<String>();
		
		for (int i = 0; i < nums.length; i++){
			list.add(Integer.toString(nums[i]));
		}
		
		while(list.removeFirstOccurrence("0")){
			zeroCount++;
		}
		
		for (int j = 0; j < zeroCount; j++) list.add("0");
		
		for (int k = 0; k < list.size(); k++){
			nums[k] = Integer.parseInt(list.get(k));
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,0,0,3,4,32,0,77,0,1,1,1,1,1};
		
		moveZeroes(nums);
		
		System.out.println(Arrays.toString(nums));
		
	}

}
