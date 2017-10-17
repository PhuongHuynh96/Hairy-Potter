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
	private Panel panel;

	public Panel2() {
		this.setBackground(Color.GREEN);
		this.setLayout(new GridBagLayout());

		gary = new Player("Gary");
		patrick = new Player("Patrick");
		pearl = new Player("Pearl");
		panel = new Panel(gary, patrick, pearl);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 0.7;

		JScrollPane jsp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.getVerticalScrollBar().setUnitIncrement(16);
		this.add(jsp, c);

		JPanel control = new JPanel();

		control.setLayout(new BoxLayout(control, BoxLayout.Y_AXIS));

		c.gridheight = 1;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1;
		c.weighty = 0.3;

		options = new JList(model);
		options.setVisible(true);
		ButtonListener bl = new ButtonListener();

		// making button arrays
		Button[0] = new JButton("Draw Card");
		Button[0].setAlignmentX(Component.LEFT_ALIGNMENT);

		Button[1] = new JButton("Move");
		Button[1].setAlignmentX(Component.LEFT_ALIGNMENT);
		Button[1].addActionListener(bl);

		Button[2] = new JButton("Play Card");
		Button[2].setAlignmentX(Component.LEFT_ALIGNMENT);
		control.add(Button[0]);
		control.add(Button[1]);
		control.add(Button[2]);
		control.setAlignmentX(Component.LEFT_ALIGNMENT);
		control.add(
				new JScrollPane(options, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));

		updateList(gary.getPossibleLocation());
		JScrollPane jsp1 = new JScrollPane(control, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		this.add(jsp1, c);
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

	public class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Button[1]) {
				gary.setLocation(options.getSelectedValue().toString());
				int rand1 = 0 + (int) (Math.random() * patrick.getPossibleLocation().length - 1);
				int rand2 = 0 + (int) (Math.random() * pearl.getPossibleLocation().length - 1);
				patrick.setLocation(patrick.getPossibleLocation()[rand1]);
				pearl.setLocation(pearl.getPossibleLocation()[rand2]);
				model.removeAllElements();
				updateList(gary.getPossibleLocation());
				panel.repaint();
				counter = 1;
			}
		}
	}

	public void updateList(String[] s) {
		for (String item : gary.getPossibleLocation()) {
			model.addElement(item);
		}
	}

}
