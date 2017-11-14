package hairyPotter;

public class CardFall extends Card{

	private String cardPath;
	private boolean passFail;
	public CardFall(){
			cardPath = "assets/images/CardFall.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Fall in the Pond for 1 integrity and 1 craft point and passed";
		String fail= "played card Fall in the Pond for 1 integrity and 1 craft point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Japanese Garden") && p.getLearning() >= 3){
			p.incrIntegrity(1);
			p.incrCraft(1);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			p.setLocation("Lactation Lounge");
			p.movePlayer();
			passFail=false;
		}
	}
	
}
