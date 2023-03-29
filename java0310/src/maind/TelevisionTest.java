package maind;

import maind.Television;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv=new Television();
		
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		tv.print();
//		System.out.println("The channel of TV is "+tv.channel+", and the volume is "+tv.volume+".");
		int ch = tv.getChannel();
	    System.out.println("The current channel is " + ch);
	}
}
