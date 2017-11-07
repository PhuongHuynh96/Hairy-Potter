package hairyPotter;

public class Card123 extends Card{

	private String cardPath;
	public Card123(){
			cardPath = "assets/images/Card123.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if ((p.getLocation().equalsIgnoreCase("ECS 302") || p.getLocation().equalsIgnoreCase("ECS 308")) && p.getLearning() >=5){
			p.incrQuality(5);
		}
		else{
			p.decrQuality(3);
			//lose one playing card
			p.removeCard(p.getCardAt(0));
			p.decrQuality(2);
		
		}
	}
	
}
