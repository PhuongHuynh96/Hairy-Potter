package hairyPotter;

public class CardBigGame extends Card{

	private String cardPath;
	private boolean passFail;
	public CardBigGame(){
			cardPath = "assets/images/CardBigGame.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card The Big Game for 1 craft poin and a location change to Lactation Lounge and passed";
		String fail= "played card The Big Game for 1 craft point and a location change to Lactation Lounge and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Pyramid")){
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
