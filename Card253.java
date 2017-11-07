package hairyPotter;

public class Card253 extends Card{

	private String cardPath;
	public Card253(){
			cardPath = "assets/images/Card253.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("George Allen Field") && p.getIntegrity() >= 4){
			p.incrCraft(2);
		}
		else{
			p.decrQuality(2);
			p.setLocation("Room of Retirement");
			p.movePlayer();
		}
	}
	

}