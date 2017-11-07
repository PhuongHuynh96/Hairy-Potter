package hairyPotter;

public class CardNetbeans extends Card{

	private String cardPath;
	public CardNetbeans(){
			cardPath = "assets/images/CardNetbeans.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Lactation Lounge") && p.getLearning() >= 3){
			p.incrQuality(5);
		}
		else{
			p.decrQuality(2);
			p.decrQuality(3);
		}
	}

}
