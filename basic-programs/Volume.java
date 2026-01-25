import java.util.*;

public class Volume{
	public static double volumeOfCylinder(double pi, int r, int h){
		double volume = (pi) * r * r * h;
		return volume;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius of cylinder: ");
		int r = sc.nextInt();
		
		System.out.print("Enter the height of the cylinder: ");
		int h = sc.nextInt();
		
		double pi = 3.14;
		
		System.out.println("Volume of cylinder is: " + volumeOfCylinder(pi, r, h));
	}
}
