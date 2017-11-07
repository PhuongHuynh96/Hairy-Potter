package hairyPotter;

public class CardPassSoccer extends Card{

	private String cardPath;
	public CardPassSoccer(){
			cardPath = "assets/images/CardPassSoccer.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("George Allen Field") && p.getCraft() >= 5){
			p.incrQuality(5);
		}
		else{
			p.decrQuality(2);
			p.decrQuality(3);
		}
	}

}