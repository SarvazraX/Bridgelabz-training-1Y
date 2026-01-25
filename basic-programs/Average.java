import java.util.*;

public class Average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.print("Enter third number: ");
		int c = sc.nextInt();
		
		double average = (a+b+c)/3;
		
		System.out.println("Average is: " + average);
	}
}