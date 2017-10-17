package hairyPotter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JLabel;
/**
 * makes the markers for the game board and updates the positions of each player
 * @author Phuong Huynh
 *
 */
public class Labels {
	
	JLabel gary, patrick, pearl;
	Point location = new Point();

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
	
	public Point getGaryLoc(){
		return gary.getLocationOnScreen();
	}
	
	public Point getPatrickLoc(){
		return patrick.getLocationOnScreen();
	}
	
	public Point getPearlLoc(){
		return pearl.getLocationOnScreen();
	}
	
	public void changeGary(Point x ){
		gary.setLocation(x);
	}
	
	public void changePatrick(Point x){
		patrick.setLocation(x);
	}
	
	public void changePearl(Point x){
		pearl.setLocation(x);
	}
	
		
}
