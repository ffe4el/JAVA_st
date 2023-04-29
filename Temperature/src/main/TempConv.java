package main;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
import javax.swing.JTextField;

public class TempConv {
    public static void main(String[] args) {

	JFrame f = new JFrame(); 
	JPanel panel = new JPanel(); 
	f.add(panel);
	JLabel label1 = new JLabel("Fahrenheit"); 
	JLabel label2 = new JLabel("Celcius");
	
	JTextField field1 = new JTextField(15); 
	JTextField field2 = new JTextField(15); 
	JButton button = new JButton("Conversion"); 
	
	//판넬에 요소 추가하기
	panel.add(label1);
	panel.add(field1);
	panel.add(label2);
	panel.add(field2);
	panel.add(button);
	
	f.setSize(300, 150); //gui 창 사이즈 조절
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //메모리에서 객체를 삭제
	f.setTitle("Temp Converter"); //제목짓기
	f.setVisible(true);	//모니터로 우리가 볼 수 있게끔
	
}}