package hairyPotter;

public class CardViolation extends Card{

	private String cardPath;
	public CardViolation(){
			cardPath = "assets/images/CardViolation.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Forbidden Parking")){
			p.incrLearning(1);
			//discard 1 game card to get another learning chip
			p.removeCard(p.getCardAt(0));
			p.incrLearning(1);
		}
		else{
			p.decrQuality(2);
		}
	}
	
}