package java0310;

public class dice {
	public static void main(String[] args) {
		int diceNum;
		for(int i=0; i<10; i++) {
		    diceNum = (int) (Math.random() * 6) + 1; //*6은 6까지의 숫자를 뽑아내라는 뜻
		    System.out.println("Dice Number: " + diceNum);
		}
	}
}
