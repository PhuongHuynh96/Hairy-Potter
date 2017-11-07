package hairyPotter;

import java.util.Random;

public class CardBuddy extends Card{

	private String cardPath;
	public CardBuddy(){
			cardPath = "assets/images/CardBuddy.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("EAT Club") || p.getLocation().equalsIgnoreCase("George Allen Field")){
			// get 1 learning or craft point
			Random rand = new Random();
			int random = rand.nextInt((2-1) + 1) + 1;
			if (random == 1){
				p.incrLearning(1);
			}
			else if(random == 2){
				p.incrCraft(1);
			}
		}
		else{
			p.decrQuality(2);
		}
	}
	
}
