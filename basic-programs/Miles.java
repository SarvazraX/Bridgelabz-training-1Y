import java.util.*;

public class Miles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter distance in kms: ");
		int distance = sc.nextInt();
		
		double miles = (distance * 0.621371);
		
		System.out.println("Distance in miles is: " + miles);
	}
}