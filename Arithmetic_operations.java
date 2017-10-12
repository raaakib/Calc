public class Arithmetic_operations {
	public static int add(int a, int b){
		return a + b;
	}
	public static int subtract(int a, int b){
		return a - b;
	}
	public static int multiply(int a, int b){
		return a * b;
	}
	public static int divide(int a, int b){
		return a / b;
	}
	public static int power(int a, int p){
		int res = a;
		for(int i=0;i<p;i++){
			res *= a;
		}
		return res;
	}
	public static int abs(int a){
		int d=-a;
		if(a < 0) return a+2*d;
		else return a;
	}
}
