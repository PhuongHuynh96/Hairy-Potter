package hairyPotter;

import java.util.Random;

public class CardBuddy extends Card{

	private String cardPath;
	private boolean passFail;
	public CardBuddy(){
			cardPath = "assets/images/CardBuddy.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Buddy Up for 1 craft point or 1 learning point and passed";
		String fail= "played card Buddy Up for 1 craft point or 1 learning point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("EAT Club") || p.getLocation().equalsIgnoreCase("George Allen Field")){
			// get 1 learning or craft point
			Random rand = new Random();
			int random = rand.nextInt((2-1) + 1) + 1;
			if (random == 1){
				p.incrLearning(1);
				passFail=true;
			}
			else if(random == 2){
				p.incrCraft(1);
				passFail=true;
			}
		}
		else{
			p.decrQuality(2);
			passFail=false;
		}
	}
	
}
