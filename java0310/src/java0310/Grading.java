package java0310;
import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
	int score;
	Scanner input = new Scanner(System.in); System.out.print("Please enter your grade: "); score = input.nextInt();
	if (score >= 90)
		System.out.println("A, Excellent!");
	else if (score >= 80) 
		System.out.println("B, Good!");
	else if (score >= 70) 
		System.out.println("C, Hmm, not bad.");
	else if (score >= 60) 
		System.out.println("D, Really?");
	else
		System.out.println("F, T_T");
	}   
}