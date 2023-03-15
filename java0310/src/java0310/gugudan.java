package java0310;
import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		int number;
		int i = 1;
		System.out.print("Please enter a number: "); 
		Scanner input = new Scanner(System.in); 
		number = input.nextInt();
		
		while (i <= 200) {
		System.out.println(number + "*" + i + "=" + number * i); i++;
		}
	}
}

