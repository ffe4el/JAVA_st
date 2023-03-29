package main;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car(); 
		myCar.changeGear(1);
		myCar.speedUp(); 
		System.out.println(myCar); //myCar의 toString 메소드가 실행됨
	}

}
