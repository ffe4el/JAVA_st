package main;

import java.awt.GridLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame;


public class GridFrame extends JFrame {
	public GridFrame() {
		setTitle("GridLayoutTest"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        setLayout(new GridLayout(0, 3)); 
        
		add(new JButton("Button1")); 
		add(new JButton("Button2")); 
		add(new JButton("Button3")); 
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		pack();
        setVisible(true);
    }

}
