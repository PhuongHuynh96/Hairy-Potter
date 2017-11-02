package hairyPotter;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import hairyPotter.Panel2.ButtonListener;

public class GameCard extends JPanel implements Runnable {
	private int countDown = 1;
	
	public GameCard(){
		Deck deck = new Deck();
		JButton cardButton = new JButton();
		ArrayList<Card> playerHand= new ArrayList<Card>();
		
		
		
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

}
