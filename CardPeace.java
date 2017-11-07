package hairyPotter;

import java.util.Random;

public class CardPeace extends Card{

	private String cardPath;
	public CardPeace(){
			cardPath = "assets/images/CardPeace.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Japanese Garden")){
			//get 1 learning chip or 1 integrity chip
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
