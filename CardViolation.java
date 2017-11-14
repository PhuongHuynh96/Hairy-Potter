package hairyPotter;

public class CardViolation extends Card{

	private String cardPath;
	private boolean passFail;
	public CardViolation(){
			cardPath = "assets/images/CardViolation.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card CECS 100 for 1 craft point and passed";
		String fail= "played card CECS 100 for 1 craft point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Forbidden Parking")){
			p.incrLearning(1);
			//discard 1 game card to get another learning chip
			p.removeCard(p.getCardAt(0));
			p.incrLearning(1);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			passFail=false;
		}
	}
	
}