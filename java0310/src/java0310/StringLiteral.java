package java0310;

// 시험에 나올 수 있다.
public class StringLiteral {
	public static void main(String[] args) {
		String str1 = new String ("Hello.");
		String str2 = "Hello.";
		String str3 = "Hello.";
		String str4 = new String ("Nice to meet you");
		

		System.out.println("str1: " + str1); 
		System.out.println("str2: " + str2); 
		System.out.println("str3: " + str3); 
		System.out.println("str4: " + str4);
		
		str3 = "Bye.";
		str1 = str4;
		str4 = "Me too.";
		System.out.println();
		
		System.out.println("str1: " + str1); 
		System.out.println("str2: " + str2); 
		System.out.println("str3: " + str3); 
		System.out.println("str4: " + str4);

	}

}
