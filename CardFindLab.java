package hairyPotter;

public class CardFindLab extends Card{

	private String cardPath;
	public CardFindLab(){
			cardPath = "assets/images/CardFindLab.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Elevators")){
			p.incrIntegrity(1);
		}
		else{
			p.decrQuality(2);
		}
	}
	
}
