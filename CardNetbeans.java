package hairyPotter;

public class CardNetbeans extends Card{

	private String cardPath;
	private boolean passFail;
	public CardNetbeans(){
			cardPath = "assets/images/CardNetbeans.png";
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
		if (p.getLocation().equalsIgnoreCase("Lactation Lounge") && p.getLearning() >= 3){
			p.incrQuality(5);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			p.decrQuality(3);
			passFail=false;
		}
	}

}
