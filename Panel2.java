package hairyPotter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * JList and Buttons along with their actions
 * 
 * @author Phuong Huynh
 *
 */
public class Panel2 extends JPanel implements ActionListener, Runnable {
	private int countDown;
	String[] data = new String[] { "North Hall", "South Hall" };
	JPanel buttonPanel = new JPanel();
//	Map<String, ArrayList<String>> location = new HashMap<String, ArrayList<String>>();

	public Panel2() {

		this.setBackground(Color.GREEN);
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		this.setLayout(new BorderLayout());
		
		//Hashmap of location combinations 
		Map<String, ArrayList<String>> location = new HashMap<String, ArrayList<String>>();
		location.put("ECS 308", new ArrayList<String>(Arrays.asList("South Hall")));
		location.put("South Hall", new ArrayList<String>(Arrays.asList("ECS 302","EAT Club","CECS Conference Room","East Walkway")));
		location.put("Lactation Lounge", new ArrayList<String>(Arrays.asList("South Hall")));
		location.put("CECS Conference Room", new ArrayList<String>(Arrays.asList("South Hall")));
		location.put("EAT Club", new ArrayList<String>(Arrays.asList("South Hall")));
		location.put("Elevators", new ArrayList<String>(Arrays.asList("North Hall","LA 5")));
		location.put("ECS 302", new ArrayList<String>(Arrays.asList("North Hall","South Hall")));
		location.put("Computer Lab", new ArrayList<String>(Arrays.asList("North Hall")));
		location.put("Room of Retirement", new ArrayList<String>(Arrays.asList("North Hall")));
		location.put("North Hall", new ArrayList<String>(Arrays.asList("South Hall", "Room of Retirement","Elevators","ECS 302","Computer Lab","West Walkway")));
		location.put("West Walkway", new ArrayList<String>(Arrays.asList("Library, North Hall, Rec Center")));
		location.put("Library", new ArrayList<String>(Arrays.asList("West Walkway")));
		location.put("LA 5", new ArrayList<String>(Arrays.asList("Elevators")));
		location.put("Bratwurst Hall", new ArrayList<String>(Arrays.asList("East Walkway")));
		location.put("East Walkway", new ArrayList<String>(Arrays.asList("South Hall","Bratwurst Hall", "Forbidden Parking")));
		location.put("Forbidden Parking", new ArrayList<String>(Arrays.asList("East Walkway")));
		location.put("Rec Center", new ArrayList<String>(Arrays.asList("West Walkway")));

		data = new String[] { "South Hall" };
		JList<String> options = new JList<String>(data);
		setFocusable(true);

		// making button arrays
		JButton Button[] = new JButton[4];
		Button[0] = new JButton("Draw Card");
		Button[0].setVisible(true);
		Button[0].setMaximumSize(new Dimension(100, 30));
		Button[0].setHorizontalAlignment(SwingConstants.LEFT);
		buttonPanel.add(Button[0]);

		Button[1] = new JButton("Move");
		Button[1].setVisible(true);
		Button[1].setMaximumSize(new Dimension(100, 30));
		buttonPanel.add(Button[1], BorderLayout.WEST);

		Button[2] = new JButton("Play Card");
		Button[2].setVisible(true);
		Button[2].setMaximumSize(new Dimension(100, 30));
		buttonPanel.add(Button[2], BorderLayout.WEST);

		this.add(buttonPanel, BorderLayout.WEST);
		buttonPanel.setPreferredSize(new Dimension(200, 500));
		buttonPanel.setVisible(true);
		setVisible(true);
		setPreferredSize(new Dimension(1200, 500));

		buttonPanel.add(options, BorderLayout.AFTER_LAST_LINE);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	@Override
	public void run() {
		while (countDown > 0) {
			try {
				Thread.sleep(50);
				repaint();
			} catch (InterruptedException e) {
				System.out.println("Error in the label reading.");
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}