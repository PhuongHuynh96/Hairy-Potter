package hairyPotter;

public class CardFall extends Card{

	private String cardPath;
	public CardFall(){
			cardPath = "assets/images/CardFall.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Japanese Garden") && p.getLearning() >= 3){
			p.incrIntegrity(1);
			p.incrCraft(1);
		}
		else{
			p.decrQuality(2);
			p.setLocation("Lactation Lounge");
			p.movePlayer();
		}
	}
	
}
