package java0310;
import java.util.Scanner;

public class ifTest {
	public static void main(String[] args) {
		int iq;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your IQ: ");
		iq = input.nextInt(); //입력한 변수를 int형으로 받겠다는 뜻
		
		if(iq >= 100) {
			System.out.print("You are smart.");
		}
		else {
			System.out.print("But I still love you.");
	
		}
	}
}
