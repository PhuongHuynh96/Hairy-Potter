package hairyPotter;

public class CardMurgolo extends Card{

	private String cardPath;
	public CardMurgolo(){
			cardPath = "assets/images/CardMurgolo.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("ECS 302")){
			p.incrLearning(1);
		}
		else{
			p.decrQuality(2);
		}
	}
	
}

