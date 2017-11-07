package hairyPotter;

import java.util.Random;

public class CardLinux extends Card {

	private String cardPath;
	public CardLinux(){
			cardPath = "assets/images/CardLinux.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Computer Lab") && p.getCraft() >= 2 && p.getIntegrity() >= 3){
			p.incrQuality(3);
			//chip of choice
			Random rand = new Random();
			int random = rand.nextInt((4-1) + 1) + 1;
			if (random == 1){
				p.incrLearning(1);
			}
			else if(random == 2){
				p.incrIntegrity(1);
			}
			else if (random == 3){
				p.incrCraft(1);
			}
			else if (random == 4){
				p.incrQuality(1);
			}
		}
		else{
			p.decrQuality(2);
			p.decrQuality(1);
		}
	}
}
