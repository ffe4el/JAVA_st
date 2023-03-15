package java0310;
import java.util.Scanner;

//그 숫자의 전체 약수를 출력하는 프로그램

public class Divisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Please enter a positive integer: "); 
		int number = input.nextInt();
		
		System.out.println("The divisors of number " + number + " as follows."); 
		for (int i = 1; i <= number; ++i) {
			if (number % i == 0 && i%2==0) 
//				if(i%2==0)
				System.out.print(" " + i);
		}
	}

}
