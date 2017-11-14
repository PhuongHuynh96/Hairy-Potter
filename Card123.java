package hairyPotter;

public class Card123 extends Card{

	private String cardPath;
	private boolean passFail;
	public Card123(){
			cardPath = "assets/images/Card123.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Math 123 for 5 quality points and passed";
		String fail= "played card Math 123 for 5 quality points and failed";
		if (p.getName().equalsIgnoreCase("Gary")){
			fail="played card Math 123 for 5 quality points and failed. A card was removed from hand.";
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
		if ((p.getLocation().equalsIgnoreCase("ECS 302") || p.getLocation().equalsIgnoreCase("ECS 308")) && p.getLearning() >=5){
			p.incrQuality(5);
			passFail=true;
		}
		else{
			p.decrQuality(3);
			//lose one playing card
			p.removeCard(p.getCardAt(0));
			p.decrQuality(2);
			passFail=false;
		
		}
	}
	
}
