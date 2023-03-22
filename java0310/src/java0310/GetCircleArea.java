package java0310;
import java.util.Scanner;

public class GetCircleArea {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a radius: ");
		
		//난 한번에 double 형태로 받겠다.
//		double radiusDbl = input.nextDouble();
		
		String radiusStr = input.next();
		double radiusDbl = Double.parseDouble(radiusStr);

		
		double circleArea = radiusDbl * radiusDbl * 3.14;
		
		System.out.println("Circle Area: " + circleArea);
	}

}
