package easy;

public class ReverseInt {

	public static int reverse(int x) {
        int ph;
        int result = 0;
        int testResult;
        
        while (x != 0){
			ph = x % 10;
			
			testResult = result * 10 + ph;
			
			if ((testResult - ph)/10 != result){
            	return 0;
			}
			
			result = testResult;
			
			x = x / 10;
		}
        
        return result;
    }
	
	public static void main(String[] args) {
		
		int num = 1000000003;
		int numr = 1929;
		
		
		System.out.println (reverse(num));
		System.out.println (1000000003%10);

	}

}
