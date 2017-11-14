package hairyPotter;

public class CardMind extends Card{

	private String cardPath;
	private boolean passFail;
	public CardMind(){
			cardPath = "assets/images/CardMind.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Exercising Mind and Body for 1 integrity point and passed";
		String fail= "played card Exercising Mind and Body for 1 integrity point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Rec Center")){
			p.incrIntegrity(1);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			passFail=false;
		}
	}
	
}
