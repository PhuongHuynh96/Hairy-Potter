import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.*;



/**
 * JList and Buttons along with their actions
 * 
 * @author Phuong Huynh
 *
 */
public class Panel2 extends JPanel implements ActionListener, Runnable {
	private int countDown;
	String[] data;

	private BufferedImageOp img;
    private JLabel map;
	private JLabel gary;
	private JLabel patrick;
	private JLabel pearl;
	private JLabel m;
	JButton Button[] = new JButton[4];

	public Panel2() {

		this.setBackground(Color.GREEN);
		this.setLayout(new BorderLayout());
		
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
       
        m=new JLabel("Marker");
        m.setForeground(Color.CYAN);
        m.setFont(new Font("Serif", Font.BOLD, 40));
        m.setBounds(610, 950, 200, 200);

        
        ImageIcon icon = new ImageIcon("../Map.png");
        map = new JLabel(icon);
        map.setBackground(Color.BLACK);
        JScrollPane jsp = new JScrollPane(map, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jsp.setPreferredSize(new Dimension(1230,550));
		jsp.setViewportView(map);
        this.add(jsp, BorderLayout.NORTH);
        
       
        map.add(gary);
        map.add(patrick);
        map.add(pearl);
        map.add(m);
        //map.revalidate();    


		JPanel control = new JPanel(new GridLayout(3,1));
		//control.setSize(1000,1000);
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
		

		// making button arrays
		Button[0] = new JButton("Draw Card");
		Button[0].setVisible(true);
		Button[0].setSize(100,10);
		//Button[0].setMaximumSize(new Dimension(100, 30));
		//Button[0].setHorizontalAlignment(SwingConstants.LEFT);

		Button[1] = new JButton("Move");
		Button[1].setVisible(true);
		Button[1].setSize(100,10);

		Button[2] = new JButton("Play Card");
		Button[2].setVisible(true);
		Button[2].setSize(100,10);

		// Setting button background to Black
		Button[0].setBackground(Color.BLACK);
		Button[1].setBackground(Color.BLACK);
		Button[2].setBackground(Color.BLACK);


		// Allowing user to click on button
		Button[0].addActionListener(this);
		Button[1].addActionListener(this);
		Button[2].addActionListener(this);

		control.add(Button[0]);
		control.add(Button[1]);
		control.add(Button[2]);
		control.setSize(new Dimension(10, 10));
		this.add(control, BorderLayout.WEST);



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