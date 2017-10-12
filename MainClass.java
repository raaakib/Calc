import java.util.Scanner;

public class MainClass {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two numbers a and b :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
		//Arithmetic addition of a and b:
		System.out.println("Addition: " + Arithmetic_operations.add(a, b));
		//Arithmetic subtraction of a and b:
		System.out.println("Subtraction: " + Arithmetic_operations.subtract(a, b));
		//Arithmetic multiplication of a and b:
		System.out.println("Multiplication: " + Arithmetic_operations.multiply(a, b));
		//Arithmetic division of a and b:
		System.out.println("Division: " + Arithmetic_operations.divide(a, b));
		//Arithmetic exponentiation of a and b:
		System.out.println("Exponentiation: " + Arithmetic_operations.power(a, b));
		//Arithmetic absolute value of a number a:
		System.out.println("Abs : " + Arithmetic_operations.abs(a));
		

	}
}
