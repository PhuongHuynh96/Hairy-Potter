package hairyPotter;

public class Card100 extends Card{

	private String cardPath;
	public Card100(){
			cardPath = "assets/images/Card100.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("ECS 308")){
			p.incrCraft(1);
		}
		else{
			p.decrQuality(2);
		}
		
	}
	

}
