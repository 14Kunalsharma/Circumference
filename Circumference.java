//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
class Circumference{
	public static void Radius(int r){
		double circumference = 2 * Math.PI * r;
		System.out.println("Circumference of a circle with radius " +r+ "=" 		+circumference);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r = sc.nextInt();
		Radius(r);
		sc.close();
	}
}