package HW01;

public class Problem02 {
	String color;
	int speed;
	int gear;
	String direction = "go straight";
	

	public String toString() {
		return "Car [color=" + color + ", speed=" + speed+", gear=" + gear+", direction=" + direction+"]";
	}
	
	void changeGear(int g) {
		gear = g;
	}
	
	void speedUp() {
		speed = speed + 10;
	}
	
	void speedDown() {
		speed = speed-10;
	}
	
	void changeDirection(int d) {
		if(d==1) {
			direction = "go straight";
		}
		else if(d==2){
			direction = "go left";
		}
		else if(d==3){
			direction = "go right";
		}
		else if(d==4){
			direction = "go back";
		}
	}
}