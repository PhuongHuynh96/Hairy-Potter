package hairyPotter;

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
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		setFocusable(true);
		
		gary = new Player("Gary");
		patrick = new Player("Patrick");
		pearl = new Player("Pearl");
        
        ImageIcon icon = new ImageIcon("Map.png");
        map = new JLabel(icon);
        map.setBackground(Color.BLACK);
        JScrollPane jsp = new JScrollPane(map, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jsp.setPreferredSize(new Dimension(1230,550));
		jsp.setViewportView(map);
//		this.add(Box.createRigidArea(new Dimension(0,5)));
		this.add(jsp);

        map.add(gary.getPlayer());
        map.add(patrick.getPlayer());
        map.add(pearl.getPlayer());
        map.revalidate();    


		JPanel control = new JPanel();
		control.setLayout(new BoxLayout(control, BoxLayout.Y_AXIS));

		options = new JList(model);

		ButtonListener bl = new ButtonListener();

		// making button arrays
		Button[0] = new JButton("Draw Card");
		Button[0].setVisible(true);
		Button[0].setMaximumSize(new Dimension(100,30));
		Button[0].setHorizontalAlignment(SwingConstants.LEFT);
		control.add(Button[0]);
		
		Button[1] = new JButton("Move");
		Button[1].setVisible(true);
		Button[1].setMaximumSize(new Dimension(100,30));
		control.add(Button[1], BorderLayout.WEST);
		Button[1].addActionListener(bl);

		Button[2] = new JButton("Play Card");
		Button[2].setVisible(true);
		Button[2].setMaximumSize(new Dimension(100,30));
		control.add(Button[2], BorderLayout.WEST);

		this.add(control, BorderLayout.WEST);
		control.setPreferredSize(new Dimension(200,500));
		control.setVisible(true);
		setVisible(true);
		setPreferredSize(new Dimension(1200,500));
		control.add(options, BorderLayout.AFTER_LAST_LINE);

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
				pearl.movePlayer();
				patrick.movePlayer();
				model.removeAllElements();
				counter = 1;
				
			}
		}
	}

}