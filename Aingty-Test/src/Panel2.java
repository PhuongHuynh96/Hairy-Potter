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
public class Panel2 extends JPanel implements Runnable {
	private int countDown;
	String[] data;

	private BufferedImageOp img;
    private JLabel map;
	private Player gary, patrick, pearl;
	private JButton Button[] = new JButton[4];
	private JList options;
	private DefaultListModel model = new DefaultListModel();
	private MouseListener mouseListener;
	private int counter = 1;
	private static String option1;


	public Panel2() {

		this.setBackground(Color.GREEN);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		gary = new Player("Gary");
		patrick = new Player("Patrick");
		pearl = new Player("Pearl");
		

        
        ImageIcon icon = new ImageIcon("../Map.png");
        map = new JLabel(icon);
        map.setBackground(Color.BLACK);
        JScrollPane jsp = new JScrollPane(map, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jsp.setPreferredSize(new Dimension(1000,550));
		jsp.setViewportView(map);
		this.add(Box.createRigidArea(new Dimension(0,5)));
		this.add(jsp);

        map.add(gary.getPlayer());
        map.add(patrick.getPlayer());
        map.add(pearl.getPlayer());
        map.revalidate();    


		JPanel control = new JPanel();
		control.setLayout(new BoxLayout(control, BoxLayout.LINE_AXIS));

		options = new JList(model);
		// mouseListener = new MouseAdapter() {
		// 	public void mouseClicked(MouseEvent mouseEvent) {
		// 	  JList theList = (JList) mouseEvent.getSource();
		// 	  if (mouseEvent.getClickCount() == 1) {
		// 		int index = theList.locationToIndex(mouseEvent.getPoint());
		// 		if (index >= 0) {
		// 			Object o = theList.getModel().getElementAt(index);
		// 		 	System.out.println("Double-clicked on: " + o.toString());
		// 		}
		// 	  }
		// 	}
		//   };
		//options.addMouseListener(mouseListener);

		ButtonListener bl = new ButtonListener();

		// making button arrays
		Button[0] = new JButton("Draw Card");
		Button[0].setVisible(true);
		

		Button[1] = new JButton("Move");
		Button[1].setVisible(true);
		Button[1].addActionListener(bl);

		Button[2] = new JButton("Play Card");
		Button[2].setVisible(true);

		// Setting button background to Black
		Button[0].setBackground(Color.BLACK);
		Button[1].setBackground(Color.BLACK);
		Button[2].setBackground(Color.BLACK);


		// Allowing user to click on button
		//Button[0].addActionListener(this);
		//Button[1].addActionListener(this);
		//Button[2].addActionListener(this);

		control.add(Button[0]);
		control.add(Button[1]);
		control.add(Button[2]);
		control.setPreferredSize(new Dimension(100,30));
		control.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.add(Box.createRigidArea(new Dimension(0,10)));
		this.add(control);
		this.add(options);
		this.add(Box.createRigidArea(new Dimension(0,200)));


	}

	public void paintComponent(Graphics g) {
		if (counter == 1)
		{
			super.paintComponent(g);
			for (String item: gary.getPossibleLocation())
			{
				model.addElement(item);
			}
		}
		counter = 0;	
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

	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == Button[1])
			{
				gary.setLocation(options.getSelectedValue().toString());
				int rand1 = 0 + (int)(Math.random() * patrick.getPossibleLocation().length - 1);
				int rand2 = 0 + (int)(Math.random() * pearl.getPossibleLocation().length - 1); 
				patrick.setLocation(patrick.getPossibleLocation()[rand1]);
				pearl.setLocation(pearl.getPossibleLocation()[rand2]);
				gary.movePlayer();
				model.removeAllElements();
				counter = 1;
				
			}
		}
	}

}