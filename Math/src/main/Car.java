package main;

public class Car {	
	String color;
	int speed;
	int gear;
	//int derection;
	
	// 재정의한것임
	@Override 
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed +", gear=" + gear + "]";
	}
	void changeGear(int g) { 
		gear = g;
	}
	void speedUp() {
	    speed = speed + 10;
	}
	void speedDown() {
		speed = speed - 10;
	}
	
	//changeDirection{go left, go right, go back, go forword}

}
