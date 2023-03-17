package java0310;
import java.util.Scanner;

public class Averager {
	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner input = new Scanner(System.in); 
		while (true) {
			System.out.print("Please enter an integer: "); 
			int grade = input.nextInt();
			if (grade < 0)
				break;
			total += grade;
			count++; 
		}
		System.out.println("Average: " + total / count);
	}
}
