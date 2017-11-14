package hairyPotter;

import java.util.Random;

public class Card122 extends Card{

	private String cardPath;
	private boolean passFail;
	public Card122(){
			cardPath = "assets/images/Card122.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Math 122 for 1 integrity or 1 learning point and passed";
		String fail= "played card Math 122 for 1 integrity or 1 learning point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Library")){
			// get 1 learning OR get 1 integrity point
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
