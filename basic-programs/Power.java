import java.util.*;
public class Power{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter base: ");
		double a = sc.nextDouble();
		
		System.out.print("Enter exponent: ");
		double n = sc.nextDouble();
		
		double result = Math.pow(a, n);
		
		System.out.println("Result is: " + result);
	}
}