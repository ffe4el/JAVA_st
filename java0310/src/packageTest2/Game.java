package packageTest2;

public class Game {
	Town firstTown = new Town();
	public void printTown() {
		System.out.print("FirstTown's name: " + firstTown.name); 
		System.out.print(", the size: " + firstTown.size); 
		System.out.println(", the number of people: " + firstTown.numOfPeople);
	}
	public void printProtagonistInfo() {
		System.out.print("Protagonist's name: " + Protagonist.name); 
		System.out.print(", the age: " + Protagonist.age);
		System.out.print(", HP: " + Protagonist.HP + ", MP: " + Protagonist.MP); 
		System.out.println(", Job: " + Protagonist.job);
	}
}
class Town{
	String name; 
	double size;
	int numOfPeople;
	
	Town(){//생성자 
		name = "Jeonju";
		size = 206.2; //km^2 
		numOfPeople = 500000;
	} 
	
}
class Protagonist{
	static String name;
	static int age; static int HP; static int MP; static String job; static String[] skills;
	static {
	name = "KDK";
	age = 60; HP = 30; MP = 50; job = "magician";
	}
}
