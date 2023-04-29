package main;
import java.awt.Color;

import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
import javax.swing.JTextField;

public class PizzaPane extends JFrame{
	public PizzaPane() {
		setSize(600, 150); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("Pizza Pane");
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		panel.setBackground(Color.blue);
		panelA.setBackground(Color.cyan);
		panelB.setBackground(Color.green);
		
		JLabel label1 = new JLabel("Please choose the type of pizza."); 
		panelA.add(label1);
		
		JButton button1 = new JButton("Combo Pizza"); 
		JButton button2 = new JButton("Potato Pizza"); 
		JButton button3 = new JButton("Bulgogi Pizza");
		
		panelB.add(button1); 
		panelB.add(button2); 
		panelB.add(button3);
		
	    JLabel label2 = new JLabel("count");
	    JTextField field1 = new JTextField(10);
	    panelB.add(label2);
	    panelB.add(field1);
	    
	    panel.add(panelA);
	    panel.add(panelB);
	    add(panel);
	    setVisible(true);
	}
}
