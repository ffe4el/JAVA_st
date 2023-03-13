package java0310;

public class Test {
	public static void main(String[] args) {
		int value1 = 3+5;
		int value2 = 8/5;
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0/5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		//byte + byte는 int형 자료임
		// byte value5 = data1 + data2;
		int value5 = data1 + data2;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		//#2.다른 자료형간의 연산
		//int value6 = 5+3.5;
		double value6 = 5+3.5;
		double value7 = 5/2; // int/int이기 때문에 2.5가 아닌 2가 나
		System.out.println(value6);
		System.out.println(value7);
		
		//@참조자료형 등가비교(번지비교)
		String str1= new String("Hello");
		String str2 = new String("Hello");
		//둘이 값은 똑같아도, 번지수가 다름
		System.out.println(str1==str2);
		
	}

}
