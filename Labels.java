package hairyPotter;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Labels {
	
	JLabel gary, patrick, pearl;
	public Labels(){
		
	gary = new JLabel("Gary");
	gary.setForeground(Color.BLUE);
    gary.setFont(new Font("Serif", Font.BOLD, 40) );
    gary.setBounds(610, 930, 100, 100);
    
    patrick = new JLabel("Patrick");
    patrick.setForeground(Color.PINK);
    patrick.setFont(new Font("Serif", Font.BOLD, 40) );
    patrick.setBounds(610, 1000, 200, 200);
    
    pearl = new JLabel("Pearl");
    pearl.setForeground(Color.DARK_GRAY);
    pearl.setFont(new Font("Serif", Font.BOLD, 40) );
    pearl.setBounds(610, 980, 100, 100);
	}
	
	
	public JLabel getGary(){
		return gary;
	}
	
	public JLabel getPatrick(){
		return patrick;
	}
	
	public JLabel getPearl(){
		return pearl;
	}
	
	public int getGaryX(){
		return gary.getX();
	}
	
	public int getGaryY(){
		return gary.getY();
	}
	
	public int getPatrickX(){
		return patrick.getX();
	}
	
	public int getPatrickY(){
		return patrick.getY();
	}
	
	public int getPearlX(){
		return pearl.getX();
	}
	
	public int getPearlY(){
		return pearl.getY();
	}
	
}
