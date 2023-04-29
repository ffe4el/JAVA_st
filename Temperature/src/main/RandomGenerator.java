package main;

import java.awt.Color;
import java.awt.Font;
//import java.awt.font;
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel;

public class RandomGenerator extends JFrame{
	JPanel p = new JPanel();
    JLabel[] labels = new JLabel[30];
    
    
	public RandomGenerator() { p.setLayout(null); 
//	p.setBackground(Color.green); 
	for (int i = 0; i < 30; i++) {
		labels[i] = new JLabel("" + i);
		int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        int s = (int)(Math.random()*50);
        Font font = new Font("Aharoni 굵게",Font.BOLD, s);
		
//		Color color[i] = new Color(r,g,b);
		int x = (int) (500 * Math.random()); 
		int y = (int) (200 * Math.random()); 
		labels[i].setForeground(new Color(r,g,b)); 
		labels[i].setFont(font);
		labels[i].setLocation(x, y); 
		labels[i].setSize(2*s,2*s); 
		p.add(labels[i]);
	}
	    setSize(500, 300);
	    add(p);
	    setVisible(true);
	}
}
	
