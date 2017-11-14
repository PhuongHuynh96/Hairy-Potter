package hairyPotter;

public class Card100 extends Card{

	private String cardPath;
	private boolean passFail;
	public Card100(){
			cardPath = "assets/images/Card100.png";
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
		if (p.getLocation().equalsIgnoreCase("ECS 308")){
			p.incrCraft(1);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			passFail=false;
		}
		
	}
	

}
