package hairyPotter;

public class Card151 extends Card{

	private String cardPath;
	private boolean passFail;
	public Card151(){
			cardPath = "assets/images/Card151.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Physics 151 for 5 quality points and passed";
		String fail= "played card Physics 151 for 5 quality points and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("ECS 308") && p.getCraft() >= 3){
			p.incrQuality(5);
			passFail=true;
		}
		else{
			p.decrQuality(3);
			p.decrQuality(2);
			passFail=false;
		}
	}
	
}
