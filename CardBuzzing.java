package hairyPotter;

import java.util.Random;

public class CardBuzzing extends Card{

	private String cardPath;
	private boolean passFail;
	public CardBuzzing(){
			cardPath = "assets/images/CardBuzzing.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Loud Buzzing for 1 random point and passed";
		String fail= "played card Loud Buzzing for 1 random point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("EAT Club") && p.getCraft() >= 3){
			// get 1 chip of choice
			Random rand = new Random();
			int random = rand.nextInt((4-1) + 1) + 1;
			if (random == 1){
				p.incrLearning(1);
				passFail=true;
			}
			else if(random == 2){
				p.incrIntegrity(1);
				passFail=true;
			}
			else if (random == 3){
				p.incrCraft(1);
				passFail=true;
			}
			else if (random == 4){
				p.incrQuality(1);
				passFail=true;
			}
		}
		else{
			p.decrQuality(2);
			p.decrQuality(2);
			passFail=false;
		}
	}
}
