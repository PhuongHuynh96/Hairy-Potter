package hairyPotter;

public class CardNature extends Card{

	private String cardPath;
	private boolean passFail;
	public CardNature(){
			cardPath = "assets/images/CardNature.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Enjoying Nature for 1 craft point and passed";
		String fail= "played card Enjoying Nature for 1 craft point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
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
			passFail=true;
		}
		else{
			p.decrQuality(2);
			passFail=false;
		}
	}
	
}
