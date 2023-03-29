package maind;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	

	void print() {
	System.out.println("The channel is " +
	channel + ", and the volume is " + volume); }
	
	int getChannel() 
	{ 
		return channel;
	}
}
