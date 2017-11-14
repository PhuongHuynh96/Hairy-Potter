package hairyPotter;

import java.util.Random;

public class CardComm extends Card{

	private String cardPath;
	private boolean passFail;
	public CardComm(){
			cardPath = "assets/images/CardComm.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Oral Communication for 1 random point and passed";
		String fail= "played card Oral Communication for 1 random point and failed";
		if (p.getName().equalsIgnoreCase("Gary")){
			fail="played card Oral Communication for 1 random point and failed. A card was removed from hand.";
		}
		else if (passFail=false){
			return fail;
		}
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if ((p.getLocation() != "ECS 302" && p.getLocation() != "ECS 308") && p.getIntegrity() >= 4 ){
			p.incrQuality(4);
			//chip of your choice
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
			//discard 1 game card
			p.removeCard(p.getCardAt(0));
			passFail=false;
		}
	}

}