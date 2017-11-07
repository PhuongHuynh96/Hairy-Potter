package hairyPotter;

public class CardRight extends Card{

	private String cardPath;
	public CardRight(){
			cardPath = "assets/images/CardRight.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Elevators") && p.getLearning() >= 4){
			p.incrCraft(2);
		}
		else{
			p.decrQuality(2);
			p.decrQuality(2);
		}
	}

}
