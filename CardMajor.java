package hairyPotter;

public class CardMajor extends Card{

	private String cardPath;
	public CardMajor(){
			cardPath = "assets/images/CardMajor.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("CECS Conference Room") && p.getIntegrity() >= 3){
			p.incrQuality(5);
		}
		else{
			p.decrQuality(2);
			p.incrQuality(3);
		}
	}

}
