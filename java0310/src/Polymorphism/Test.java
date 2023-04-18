package Polymorphism;

public class Test {
	public static void printLocation(Shape s) {
		System.out.println("x=" + s.x + " y=" + s.y);
	}

	public static void main(String arg[]) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		

		printLocation(r);
		printLocation(t);
		printLocation(c);
	}

}
