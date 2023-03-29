package main;

public class MathTest {
	public static void main(String[] args) {
		int sum;
		Math obj = new Math();
	    sum = obj.add(2, 3);
	    System.out.println("2 + 3 = " + sum);
	    sum = obj.add(7, 8);
	    System.out.println("7 + 8 = " + sum);
	    
	    sum = obj.gs(2,3);
	    System.out.println("2 * 3 = " + sum);
	    
	    sum = obj.nn(9,3);
	    System.out.println("9 / 3 = " + sum);
	}
}
