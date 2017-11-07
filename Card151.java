package hairyPotter;

public class Card151 extends Card{

	private String cardPath;
	public Card151(){
			cardPath = "assets/images/Card151.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("ECS 308") && p.getCraft() >= 3){
			p.incrQuality(5);
		}
		else{
			p.decrQuality(3);
			p.decrQuality(2);
		}
	}
	
}
