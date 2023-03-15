package java0310;
import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in); System.out.print("Please enter your rank: "); number = input.nextInt();
		switch(number){
			case 0:
			    System.out.println("Wrong~");
			    break;
			case 1:
				System.out.println("Gold Medal."); 
				break;
			case 2:
				System.out.println("Silver Medal.");
				break;
			case 3:
			    System.out.println("Bronze Medal.");
			    break;
			default: 
				System.out.println("Fighting~"); 
				break;
		}
	}
}
