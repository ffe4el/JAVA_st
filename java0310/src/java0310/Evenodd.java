package java0310;
import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an interger : ");
		number = input.nextInt();
		
		if(number%2 == 0) {
			System.out.println("The value is even.");
		}
		else {
			System.out.println("The value is odd.");
		}
		System.out.println("Program exited.");
	}
}
