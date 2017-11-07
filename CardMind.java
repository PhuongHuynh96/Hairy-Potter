package hairyPotter;

public class CardMind extends Card{

	private String cardPath;
	public CardMind(){
			cardPath = "assets/images/CardMind.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Rec Center")){
			p.incrIntegrity(1);
		}
		else{
			p.decrQuality(2);
		}
	}
	
}
