package hairyPotter;

import java.util.Random;

public class CardPeace extends Card{

	private String cardPath;
	private boolean passFail;
	public CardPeace(){
			cardPath = "assets/images/CardPeace.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card CECS 100 for 1 craft point and passed";
		String fail= "played card CECS 100 for 1 craft point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Japanese Garden")){
			//get 1 learning chip or 1 integrity chip
			Random rand = new Random();
			int random = rand.nextInt((2-1) + 1) + 1;
			if (random == 1){
				p.incrLearning(1);
				passFail=true;
			}
			else if(random == 2){
				p.incrIntegrity(1);
				passFail=true;
			}
		}
		else{
			p.decrQuality(2);
			passFail=false;
		}
	}

}
