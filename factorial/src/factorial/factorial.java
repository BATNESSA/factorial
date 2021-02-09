package factorial;

public class factorial {
	
	public static void main(String[] args) {
		int fact= 5;
		System.out.println("el faactorial de "+fact);
		

	}

	//6 = 6*5*4*3*2*1= 
	static int factorial (int num) {
		int contador = num;//1
		int res=0;
		
		//1.2.5
		//1,2,3,5
		//1,2,3,4
		if (num >= 0) {//2
			res=1;
			while ( contador > 1) {//3
				res = res * contador; //4
				contador--;
			}
		} 
			
		return res;//5
	}
	
	static int factorialRecursivo (int num) {
		if (num == 0)
			return 1;
		else {
			int res = num * factorialRecursivo (num-1);
			return res;	
		}
	}
}
