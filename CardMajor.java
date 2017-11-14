package hairyPotter;

public class CardMajor extends Card{

	private String cardPath;
	private boolean passFail;
	public CardMajor(){
			cardPath = "assets/images/CardMajor.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Choosing a Major for 5 quality points and passed";
		String fail= "played card Choosing a Major for 5 quality points and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("CECS Conference Room") && p.getIntegrity() >= 3){
			p.incrQuality(5);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			p.incrQuality(3);
			passFail=false;
		}
	}

}
