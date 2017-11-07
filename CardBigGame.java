package hairyPotter;

public class CardBigGame extends Card{

	private String cardPath;
	public CardBigGame(){
			cardPath = "assets/images/CardBigGame.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Pyramid")){
			p.incrCraft(1);
			p.setLocation("Lactation Lounge");
			p.movePlayer();
		}
		else{
			p.decrQuality(2);
		}
	}
	
}
