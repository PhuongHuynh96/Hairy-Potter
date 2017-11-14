package hairyPotter;

public class CardFindLab extends Card{

	private String cardPath;
	private boolean passFail;
	public CardFindLab(){
			cardPath = "assets/images/CardFindLab.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Finding the Lab for 1 integrity point and passed";
		String fail= "played card Finding the Lab for 1 integrity point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Elevators")){
			p.incrIntegrity(1);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			passFail=false;
		}
	}
	
}
