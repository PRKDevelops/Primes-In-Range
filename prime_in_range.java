
public class prime_in_range {
	
		public static void main(String args[]){
			int lower = 1, upper = 40;
			for(int i = lower; i<= upper; i++)
				if(isprime(i))
					System.out.println(i);
		}
		public static boolean isprime(int n){
			if(n<2)
				return false;
			for(int i=2; i<n; i++){
				if(n%i == 0)
					return false;
			}
			return true;
		
	}
}
