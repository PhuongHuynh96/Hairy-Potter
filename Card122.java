package hairyPotter;

import java.util.Random;

public class Card122 extends Card{

	private String cardPath;
	public Card122(){
			cardPath = "assets/images/Card122.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Library")){
			// get 1 learning OR get 1 integrity point
			Random rand = new Random();
			int random = rand.nextInt((2-1) + 1) + 1;
			if (random == 1){
				p.incrLearning(1);
			}
			else if(random == 2){
				p.incrIntegrity(1);
			}
			
		}
		else{
			p.decrQuality(2);
		}
	}
	
}
