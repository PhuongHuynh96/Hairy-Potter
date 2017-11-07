package hairyPotter;

public class CardBratwurst extends Card{

	private String cardPath;
	public CardBratwurst(){
			cardPath = "assets/images/Bratwurst.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Bratwurst Hall")){
			p.incrCraft(1);
		}
		else{
			p.decrQuality(2);
		}
	}
	
}
