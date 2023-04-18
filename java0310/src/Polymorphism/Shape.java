package Polymorphism;

class Shape {
	protected int x, y;

	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape {
	public int width, height;

	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle extends Shape {
	public int base, height;

	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle extends Shape {
	public int radius;

	public void draw() {
		System.out.println("Circle Draw");
	}
}