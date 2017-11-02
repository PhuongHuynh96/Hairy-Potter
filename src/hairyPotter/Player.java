package hairyPotter;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.*;

/**
 * Player movements and updating location
 * 
 * @author Phuong Huynh
 *
 */
public class Player {

	private JLabel character;
	private String name;
	private String locale;
	private String points;

	// Hashmap of location combinations
	Map<String, String[]> location = new HashMap<String, String[]>();
	Map<String, Point[]> updateLocation = new HashMap<String, Point[]>();

	public Player(String x) {
		character = new JLabel(x);
		name = x;
		locale = "ECS 308";

		if (x.equalsIgnoreCase("Gary")) {
			name = x;
			character.setForeground(Color.BLUE);
			character.setFont(new Font("Serif", Font.BOLD, 30));
			character.setBounds(610, 930, 100, 100);
		} else if (x.equalsIgnoreCase("Patrick")) {
			name = x;
			character.setForeground(Color.PINK);
			character.setFont(new Font("Serif", Font.BOLD, 30));
			character.setBounds(610, 1000, 200, 200);
		} else if (x.equalsIgnoreCase("Pearl")) {
			name = x;
			character.setForeground(Color.DARK_GRAY);
			character.setFont(new Font("Serif", Font.BOLD, 30));
			character.setBounds(610, 980, 100, 100);
		}

		location.put("ECS 308", new String[] { "South Hall" });
		location.put("South Hall", new String[] { "ECS 308", "ECS 302", "EAT Club", "CECS Conference Room",
				"East Walkway", "North Hall", "Lactation Lounge" });
		location.put("Lactation Lounge", new String[] { "South Hall" });
		location.put("CECS Conference Room", new String[] { "South Hall" });
		location.put("EAT Club", new String[] { "South Hall" });
		location.put("Elevators", new String[] { "North Hall", "LA 5" });
		location.put("ECS 302", new String[] { "North Hall", "South Hall" });
		location.put("Computer Lab", new String[] { "North Hall" });
		location.put("Room of Retirement", new String[] { "North Hall" });
		location.put("North Hall", new String[] { "South Hall", "Room of Retirement", "Elevators", "ECS 302",
				"Computer Lab", "West Walkway" });
		location.put("West Walkway", new String[] { "Library", "North Hall", "Rec Center" });
		location.put("Library", new String[] { "West Walkway" });
		location.put("LA 5", new String[] { "Elevators" });
		location.put("Bratwurst Hall", new String[] { "East Walkway" });
		location.put("East Walkway", new String[] { "South Hall", "Bratwurst Hall", "Forbidden Parking" });
		location.put("Forbidden Parking", new String[] { "East Walkway" });
		location.put("Rec Center", new String[] { "West Walkway" });

		updateLocation.put("South Hall", new Point[] { new Point(610, 800), new Point(610, 870), new Point(610, 840) });
		updateLocation.put("ECS 308", new Point[] { new Point(610, 930), new Point(610, 1000), new Point(610, 970) });
		updateLocation.put("ECS 302", new Point[] { new Point(610, 650), new Point(610, 720), new Point(610, 690) });
		updateLocation.put("EAT Club", new Point[] { new Point(760, 650), new Point(760, 720), new Point(760, 690) });
		updateLocation.put("CECS Conference Room",
				new Point[] { new Point(900, 650), new Point(900, 720), new Point(900, 690) });
		updateLocation.put("North Hall", new Point[] { new Point(260, 800), new Point(260, 870), new Point(260, 840) });
		updateLocation.put("East Walkway",
				new Point[] { new Point(1070, 800), new Point(1070, 870), new Point(1070, 840) });
		updateLocation.put("Elevators", new Point[] { new Point(490, 930), new Point(490, 1000), new Point(490, 970) });
		updateLocation.put("Room of Retirement",
				new Point[] { new Point(290, 930), new Point(290, 1000), new Point(290, 970) });
		updateLocation.put("West Walkway", new Point[] { new Point(25, 800), new Point(25, 870), new Point(25, 840) });
		updateLocation.put("Library", new Point[] { new Point(100, 1200), new Point(100, 1270), new Point(100, 1240) });
		updateLocation.put("LA 5", new Point[] { new Point(500, 1200), new Point(500, 1270), new Point(500, 1240) });
		updateLocation.put("Bratwurst Hall",
				new Point[] { new Point(850, 1200), new Point(850, 1270), new Point(850, 1240) });
		updateLocation.put("Lactation Lounge",
				new Point[] { new Point(890, 930), new Point(890, 1000), new Point(890, 970) });
		updateLocation.put("Computer Lab",
				new Point[] { new Point(290, 610), new Point(290, 680), new Point(290, 650) });
		updateLocation.put("Rec Center", new Point[] { new Point(500, 400), new Point(500, 470), new Point(500, 440) });
		updateLocation.put("Forbidden Parking",
				new Point[] { new Point(900, 350), new Point(900, 420), new Point(900, 390) });

	}

	public JLabel getPlayer() {
		return this.character;
	}

	public void setLocation(String x) {
		this.locale = x;
	}

	public String[] getPossibleLocation() {
		return location.get(this.locale);
	}

	public String getLocation() {
		return this.locale;
	}

	public Point getPoint() {
		if (name.equalsIgnoreCase("gary")) {
			return updateLocation.get(locale)[0];
		} else if (name.equalsIgnoreCase("pearl")) {
			return updateLocation.get(locale)[1];
		} else {
			return updateLocation.get(locale)[2];
		}
	}

	public String getName() {
		return name;
	}

	public void movePlayer() {
		if (name.equalsIgnoreCase("gary")) {
			int x = (int) updateLocation.get(this.locale)[0].getX();
			int y = (int) updateLocation.get(this.locale)[0].getY();
			character.setBounds(x, y, 100, 100);
		} else if (name.equalsIgnoreCase("pearl")) {
			int x = (int) updateLocation.get(this.locale)[2].getX();
			int y = (int) updateLocation.get(this.locale)[2].getY();
			character.setBounds(x, y, 100, 100);
		} else if (name.equalsIgnoreCase("patrick")) {
			int x = (int) updateLocation.get(this.locale)[1].getX();
			int y = (int) updateLocation.get(this.locale)[1].getY();
			character.setBounds(x, y, 100, 100);
		}
	}

}
