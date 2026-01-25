import java.util.*;

public class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter principle: ");
		int p = sc.nextInt();
		
		System.out.print("Enter time: ");
		int t = sc.nextInt();
		
		System.out.print("Enter rate: ");
		int r = sc.nextInt();
		
		float si = (p * r * t) / 100;
		
		System.out.println("The simple interest is: " + si);
		
		System.out.println("Total amount to be paid: " + (p + si));
	}
}