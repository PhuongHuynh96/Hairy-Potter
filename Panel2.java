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

	private int cardShift = 0;
	private Player gary, patrick, pearl;
	private JButton Button[] = new JButton[4];
	private JList options;
	private DefaultListModel model = new DefaultListModel();
	private int counter = 1;
	private Panel panel;
	private Deck deck = new Deck();
	private ImageIcon active = new ImageIcon();
	private int moveCount = 0;
	private boolean isPlay = false;

	public Panel2() {
		this.setBackground(Color.GREEN);
		this.setLayout(new GridBagLayout());

		// initializes the characters that are playing
		gary = new Player("Gary");
		patrick = new Player("Patrick");
		pearl = new Player("Pearl");

		// initializes the deck and array
		//each player has 5 cards 

		deck.resetDeck();
		for (int i = 0; i < 5; i++){
			gary.addCards(deck.dealDeck());
			patrick.addCards(deck.dealDeck());
			pearl.addCards(deck.dealDeck());
		}
		
		
		

		// visual constraints of the players
		panel = new Panel(gary, patrick, pearl);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 0.7;

		// making the scrollbar
		JScrollPane jsp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.getVerticalScrollBar().setUnitIncrement(16);
		this.add(jsp, c);

		// main panel that others are added into
		JPanel boss = new JPanel();
		boss.setLayout(new FlowLayout());
		boss.setAlignmentX(Component.LEFT_ALIGNMENT);
		boss.setAlignmentY(Component.LEFT_ALIGNMENT);

		// creating a JPanel with JList and Buttons in it
		JPanel control = new JPanel();

		// creating a JPanel for card button
		JPanel cardButton = new JPanel();

		// Creating JTextArea
		JTextArea text1 = new JTextArea(100, 20);
		JTextArea text2 = new JTextArea(50, 1);
		JPanel textHolder = new JPanel();
		textHolder.setLayout(new BoxLayout(textHolder, BoxLayout.Y_AXIS));
		text1.setEditable(false);
		text2.setEditable(false);
		text1.append("Nith says hi");
		text2.append("Nith says bye");

		control.setLayout(new BoxLayout(control, BoxLayout.Y_AXIS));
		cardButton.setLayout(new FlowLayout());

		c.gridheight = 1;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1;
		c.weighty = 0.3;

		// creating a JList
		options = new JList(model);
		options.setVisibleRowCount(0);
		options.setVisible(true);
		ButtonListener b0 = new ButtonListener();
		ButtonListener bl = new ButtonListener();
		ButtonListener b2 = new ButtonListener();
		ButtonListener b3 = new ButtonListener();

		// making button arrays
		Button[0] = new JButton("Draw Card");
		Button[0].setAlignmentX(Component.LEFT_ALIGNMENT);
		Button[0].addActionListener(b0);

		Button[1] = new JButton("Move");
		Button[1].setAlignmentX(Component.LEFT_ALIGNMENT);
		Button[1].addActionListener(bl);

		Button[2] = new JButton("Play Card");
		Button[2].setAlignmentX(Component.LEFT_ALIGNMENT);
		Button[2].addActionListener(b2);

		control.add(Button[0], c);
		control.add(Button[1], c);
		control.add(Button[2], c);

		// card button
		ImageIcon active = new ImageIcon("");
		Button[3] = new JButton();
		Button[3].setIcon(active);
		Button[3].addActionListener(b3);
		Button[3].setPreferredSize(new Dimension(150, 250));
		cardButton.add(Button[3]);

		control.setAlignmentX(Component.LEFT_ALIGNMENT);

		// add scroll bar into control panel
		control.add(
				new JScrollPane(options, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));

		// update possible location to go to in JList
		updateList(gary.getPossibleLocation());

		// lower scroll bar so that the buttons show up, this scroll bar doesn't
		// actually scroll
		// it ensures the buttons show up
		JScrollPane jsp1 = new JScrollPane(boss, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JScrollPane jsp2 = new JScrollPane(text1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JScrollPane jsp3 = new JScrollPane(text2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		control.setPreferredSize(new Dimension(250, 300));
		boss.add(control);
		// boss.add(Box.createRigidArea(new Dimension(10,15)));
		boss.add(cardButton);
		// boss.add(Box.createRigidArea(new Dimension(950,15)));
		textHolder.add(jsp2);
		textHolder.add(Box.createRigidArea(new Dimension(5, 15)));
		textHolder.add(jsp3);
		textHolder.setPreferredSize(new Dimension(1500, 250));
		boss.add(textHolder);
		// this.add(boss, c);
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
			// move player on map
			if (e.getSource() == Button[1]) {
				if (moveCount++ >= 3){
					if(isPlay){
						moveCount=0;
					}
				}
				else{
					gary.setLocation(options.getSelectedValue().toString());
					int rand1 = 0 + (int) (Math.random() * patrick.getPossibleLocation().length - 1);
					int rand2 = 0 + (int) (Math.random() * pearl.getPossibleLocation().length - 1);
					patrick.setLocation(patrick.getPossibleLocation()[rand1]);
					pearl.setLocation(pearl.getPossibleLocation()[rand2]);
					model.removeAllElements();
					updateList(gary.getPossibleLocation());
					panel.repaint();
					counter = 1;
					isPlay=false;
				}
				
			}

			// draw Card
			if (e.getSource() == Button[0]) {
				gary.addCards(deck.dealDeck());
				deck.cardsLeft();
				
			}
			// play card
			if (e.getSource() == Button[2]) {
				isPlay=true;
				deck.incrDiscard();
				gary.getCardAt((cardShift)-1).play(gary, deck);
			}

			// button that makes cards user has in hand move/update
			if (e.getSource() == Button[3]) {
				if (cardShift++ > gary.getCardSize()) {
					cardShift = 0;
					active = new ImageIcon(gary.getCardAt(0).getCardPath());
				}
				else{
					active = new ImageIcon(gary.getCardAt((cardShift)-1).getCardPath());
				}
				
				Button[3].setIcon(active);

			}

		}
	}

	public void updateList(String[] s) {
		for (String item : gary.getPossibleLocation()) {
			model.addElement(item);
		}
	}

}
