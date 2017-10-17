package hairyPotter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Player {
	
	private JLabel name;
	
	public Player(String x){
		name = new JLabel(x);
		if (x.equalsIgnoreCase("Gary")){
			 name.setForeground(Color.BLUE);
		     name.setFont(new Font("Serif", Font.BOLD, 40) );
		     name.setBounds(610, 930, 100, 100);
		}
		else if (x.equalsIgnoreCase("Patrick")){
			 name.setForeground(Color.PINK);
		     name.setFont(new Font("Serif", Font.BOLD, 40) );
		     name.setBounds(610, 1000, 200, 200);
		}
		else if(x.equalsIgnoreCase("Pearl")){
	        name.setForeground(Color.DARK_GRAY);
	        name.setFont(new Font("Serif", Font.BOLD, 40) );
	        name.setBounds(610, 980, 100, 100);
		}
	}
	
		
	public void youMove(String currentLocation)
	{
		System.out.println(currentLocation);
	}

}
