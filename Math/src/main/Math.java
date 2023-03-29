package main;

public class Math {
	int add(int x, int y) {
		return x + y; 
	}
	int gs(int x, int y) {
		return x*y;
	}
	int nn(int x, int y) {
		if(y==0) {
			System.out.println("error!");
			return 0;
		}
		else{
			return x/y;
		}
	}
}
