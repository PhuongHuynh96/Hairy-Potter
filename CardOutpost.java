package hairyPotter;

import java.util.Random;

public class CardOutpost extends Card{

	private String cardPath;
	private boolean passFail;
	public CardOutpost(){
			cardPath = "assets/images/CardOutpost.png";
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
		if (p.getLocation().equalsIgnoreCase("George Allen Field") || p.getLocation().equalsIgnoreCase("Japanese Garden") ||
				p.getLocation().equalsIgnoreCase("Pyramid") || p.getLocation().equalsIgnoreCase("Rec Center")
				|| p.getLocation().equalsIgnoreCase("East Walkway") || p.getLocation().equalsIgnoreCase("West Walkway") ||
				p.getLocation().equalsIgnoreCase("Library") || p.getLocation().equalsIgnoreCase("LA 5") ||
				p.getLocation().equalsIgnoreCase("Bratwurst Hall")){
			//get 1 chip of choice 
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
			passFail=false;
		}
	}
	
}
