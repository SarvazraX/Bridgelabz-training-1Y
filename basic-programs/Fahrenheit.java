import java.util.*;

public class Fahrenheit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter temperature in celcius: ");
		float celcius = sc.nextFloat();
		
		float fahrenheit = (celcius * 9/5) + 32;
		
		System.out.println("Temperature in fahrenheit is: " + fahrenheit);
	}
}