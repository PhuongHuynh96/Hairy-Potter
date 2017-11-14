package hairyPotter;

public class CardPassSoccer extends Card{

	private String cardPath;
	private boolean passFail;
	public CardPassSoccer(){
			cardPath = "assets/images/CardPassSoccer.png";
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
		if (p.getLocation().equalsIgnoreCase("George Allen Field") && p.getCraft() >= 5){
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