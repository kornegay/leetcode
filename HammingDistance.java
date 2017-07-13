package easy;

public class HammingDistance {

	public static int hammingDistance(int a, int b){
		char[] aa = Integer.toString(a, 2).toCharArray();
		char[] bb = Integer.toString(b, 2).toCharArray();
		int distance = 0;
		char[] checkA = new char[32];
		char[] checkB = new char[32];
		
		
		for (int x = 0; x < 32; x++){
			checkA[x] = '0';
			checkB[x] = '0';
		}

		
		for (int i = 0; i < aa.length; i++){
		    checkA[31 - i] = aa[aa.length - i - 1];
		}
		
		for (int j = 0; j < bb.length; j++){
		    checkB[31 - j] = bb[bb.length - j - 1];
		}
		
		for (int k = 0; k < 32; k++){
			if (checkA[k] != checkB[k]) distance++;
		}
		
		return distance;
	}
	
	public static void main(String[] args) {
		int a = 9823;
		int b = 1370128;
		
		System.out.println(hammingDistance(a, b));
	}

}
