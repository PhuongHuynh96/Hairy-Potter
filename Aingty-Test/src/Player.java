import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.*;

public class Player {
	
    private JLabel character;
    private String name;
    private String locale;

    //Hashmap of location combinations 
    Map<String, String[]> location = new HashMap<String, String[]>();
    Map<String, Point[] > updateLocation = new HashMap<String, Point[]>();

	
	public Player(String x){
        character = new JLabel(x);
        locale = "ECS 308";
		if (x.equalsIgnoreCase("Gary")){
            name = x;
            character.setForeground(Color.BLUE);
            character.setFont(new Font("Serif", Font.BOLD, 40) );
            character.setBounds(610, 930, 100, 100);
		}
		else if (x.equalsIgnoreCase("Patrick")){
            name=x;
			 character.setForeground(Color.PINK);
		     character.setFont(new Font("Serif", Font.BOLD, 40) );
		     character.setBounds(610, 1000, 200, 200);
		}
		else if(x.equalsIgnoreCase("Pearl")){
            name=x;
	        character.setForeground(Color.DARK_GRAY);
	        character.setFont(new Font("Serif", Font.BOLD, 40) );
	        character.setBounds(610, 980, 100, 100);
        }
        
        location.put("ECS 308", new String[] {"South Hall"});
		location.put("South Hall", new String[] {"ECS 302","EAT Club","CECS Conference Room","East Walkway","North Hall"});
		location.put("Lactation Lounge", new String[] {"South Hall"});
		location.put("CECS Conference Room", new String[] {"South Hall"});
		location.put("EAT Club", new String[] {"South Hall"});
		location.put("Elevators", new String[] {"North Hall","LA 5"});
		location.put("ECS 302", new String[] {"North Hall","South Hall"});
		location.put("Computer Lab", new String[] {"North Hall"});
		location.put("Room of Retirement", new String[] {"North Hall"});
		location.put("North Hall", new String[] {"South Hall", "Room of Retirement","Elevators","ECS 302","Computer Lab","West Walkway"});
		location.put("West Walkway", new String[] {"Library, North Hall, Rec Center"});
		location.put("Library", new String[] {"West Walkway"});
		location.put("LA 5", new String[] {"Elevators"});
		location.put("Bratwurst Hall", new String[] {"East Walkway"});
		location.put("East Walkway", new String[] {"South Hall","Bratwurst Hall", "Forbidden Parking"});
		location.put("Forbidden Parking", new String[] {"East Walkway"});
        location.put("Rec Center", new String[] {"West Walkway"});

        updateLocation.put("South Hall", new Point[] {new Point(610,800), new Point(610,870), new Point(610,850)});
        updateLocation.put("ECS 308", new Point[] {new Point(610,930), new Point(610,1000), new Point(610,980)});
        updateLocation.put("ECS 302", new Point[] {new Point(610,650), new Point(610,720), new Point(610,700)});
        updateLocation.put("EAT Club", new Point[] {new Point(760,650), new Point(760,720), new Point(760,700)});
        updateLocation.put("CECS Conference Room", new Point[] {new Point(760,820), new Point(760,890), new Point(760,870)});
        updateLocation.put("North Hall", new Point[] {new Point(260,800), new Point(260,870), new Point(260,850)});
        
	}
    
    public JLabel getPlayer()
    {
        return this.character;
    }

    public void setLocation(String x)
    {
        this.locale = x;
    }
    
    public String[] getPossibleLocation()
    {
        return location.get(this.locale);
    }

    public String getLocation()
    {
        return this.locale;
    }

    public void movePlayer(){
        if(name.equalsIgnoreCase("gary")){
            int x = (int) updateLocation.get(this.locale)[0].getX();
            int y = (int) updateLocation.get(this.locale)[0].getY();
            character.setBounds(x,y,100,100);
        }
    }

}
