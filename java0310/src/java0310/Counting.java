package java0310;

public class Counting {
	public static void main(String[] args) {
		String s = "no news is good news";
		int n=0;
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i) !='n')
				continue;
			n++;
		}
		System.out.println("Counting number of n: "+n);
	}
}
