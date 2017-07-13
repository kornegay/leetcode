package easy;

public class CountPrimes {

	public static int countPrimes(int n){
		int numPrimes = 2;
		
		if (n == 0 || n == 1 || n == 2) return 0;
        if (n == 3) return 1;
		
		for (int i = 5; i <= n; i+=2){
			if (isPrime(i)){
				numPrimes++;
			}
		}
		
		return numPrimes;
	}
	
	public static boolean isPrime(int number){
		
		for (int i = 2; i*i < number; i++){
			if (number % i == 0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int n = 150000;
		
		System.out.println(countPrimes(n));

	}

}
