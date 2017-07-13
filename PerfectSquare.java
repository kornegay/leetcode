package easy;

public class PerfectSquare {

	public static boolean isPerfectSquare(int num){
		
		if (num < 0) return false;
		if (num == 1) return true;
		
		int start = 1, end = num, mid = 0;
		
		while (start <= end){
			mid = (end - start) / 2 + start;
			
			if (mid * mid > num) end = mid - 1;
			else if (mid * mid < num) start = mid + 1;
			else return true;
		}
		
		return start * start == num;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(169));

	}

}
