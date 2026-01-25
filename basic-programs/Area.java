import java.util.*;

public class Area{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		float radius = sc.nextFloat();
		
		double area = 3.14 * radius * radius;
		
		System.out.println("The area of the circle is: " + area);
	}
}