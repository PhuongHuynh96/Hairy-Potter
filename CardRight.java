package hairyPotter;

public class CardRight extends Card{

	private String cardPath;
	private boolean passFail;
	public CardRight(){
			cardPath = "assets/images/CardRight.png";
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
		if (p.getLocation().equalsIgnoreCase("Elevators") && p.getLearning() >= 4){
			p.incrCraft(2);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			p.decrQuality(2);
			passFail=false;
		}
	}

}
