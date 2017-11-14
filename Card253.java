package hairyPotter;

public class Card253 extends Card{

	private String cardPath;
	private boolean passFail;
	public Card253(){
			cardPath = "assets/images/Card253.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card KIN 253 for 2 craft points and passed";
		String fail= "played card KIN 253 for 2 craft points and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("George Allen Field") && p.getIntegrity() >= 4){
			p.incrCraft(2);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			p.setLocation("Room of Retirement");
			p.movePlayer();
			passFail=false;
		}
	}
	

}