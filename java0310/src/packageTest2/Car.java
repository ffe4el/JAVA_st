package packageTest2;

public class Car {
	private String model; //힙영역에 저장ㅇㅇ
	private String color; //힙영역에 저장ㅇㅇ
	private int speed;//힙영역에 저장ㅇㅇ
	private int id;//힙영역에 저장ㅇㅇ
	
	private static int numbers = 0;	//모든객체가 공유하는 -> 공유변수임, 데이터영역에 저장
	
	public Car(String m, String c, int s) { 
		model = m;
		color = c;
		speed = s;
	    id = ++numbers;
	}
	public void printCarId() {
	System.out.println(this.model + "'s id : " + this.id);
	}
	
	public void printCarNumbers() {
	System.out.println("The number of generated cars = " + numbers);
	}

}
