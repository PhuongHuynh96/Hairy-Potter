package hairyPotter;

public class CardNature extends Card{

	private String cardPath;
	public CardNature(){
			cardPath = "assets/images/CardNature.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("George Allen Field") || p.getLocation().equalsIgnoreCase("Japanese Garden") ||
				p.getLocation().equalsIgnoreCase("Pyramid") || p.getLocation().equalsIgnoreCase("Rec Center")
				|| p.getLocation().equalsIgnoreCase("East Walkway") || p.getLocation().equalsIgnoreCase("West Walkway") ||
				p.getLocation().equalsIgnoreCase("Library") || p.getLocation().equalsIgnoreCase("LA 5") ||
				p.getLocation().equalsIgnoreCase("Bratwurst Hall") || p.getLocation().equalsIgnoreCase("Forbidden Parking")){
			p.incrCraft(1);
			p.setLocation("Lactation Lounge");
			p.movePlayer();
		}
		else{
			p.decrQuality(2);
		}
	}
	
}
