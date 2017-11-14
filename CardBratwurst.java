package hairyPotter;

public class CardBratwurst extends Card{

	private String cardPath;
	private boolean passFail;
	public CardBratwurst(){
			cardPath = "assets/images/Bratwurst.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Lunch at Bratwurst Hall for 1 craft point and passed";
		String fail= "played card Lunch at Bratwurst Hall for 1 craft point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Bratwurst Hall")){
			p.incrCraft(1);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			passFail=false;
		}
	}
	
}
