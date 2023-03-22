package java0310;

public class ExternalCallMethods {
	public static void main(String[] args) {
		C c= new C();
		
		c.print();
		double sum = c.sum(10, 2.9); System.out.println("sum: " + sum);
	}
}

class C {
    void print() {
    	System.out.println("Hello."); 
	}
    double sum(int a, double b) {
        return a + b;
    } 
}