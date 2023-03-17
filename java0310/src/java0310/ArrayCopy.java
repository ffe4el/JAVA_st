package java0310;
//얕은 복사
public class ArrayCopy {
	public static void main(String args[]) {
		int num1 =30;
		int num2 = num1;
		int[] list1 = {10,20,30,40,50};
		int[] list2 = list1;
		
		num2 = 1000;
		list2[2]= 1000;
		
		System.out.println("<num1>");
		System.out.println(num1);
		
		System.out.println("<num2>");
		System.out.println(num2);
		
		System.out.println("<Array list1>");
		for(int value : list1)
			System.out.print(value + " ");
		
		System.out.println("\n<Array list2>");
		for(int value : list2)
			System.out.print(value + " ");
		

	}
}

//배열의 '데이터값'을 복사하고 싶다. 코드를 어떻게 바꾸면 될까?? => 깊복사
//for loop를 이용해서 list2에 list1값을 넣어주면 됨