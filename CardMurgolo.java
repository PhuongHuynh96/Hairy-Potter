package hairyPotter;

public class CardMurgolo extends Card{

	private String cardPath;
	private boolean passFail;
	public CardMurgolo(){
			cardPath = "assets/images/CardMurgolo.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
	 	String line = "played card Professor Murgolo's CECS 174 Class for 1 learning point and passed";
		String fail= "played card Professor Murgolo's CECS 174 Class for 1 learning point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("ECS 302")){
			p.incrLearning(1);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			passFail=false;
		}
	}
	
}

