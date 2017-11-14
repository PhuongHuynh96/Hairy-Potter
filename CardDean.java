package hairyPotter;

public class CardDean extends Card{

	private String cardPath;
	private boolean passFail;
	public CardDean(){
			cardPath = "assets/images/CardDean.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Make Dean's List for 5 quality points and passed";
		String fail= "played card Make Dean's List for 5 quality points and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if ((p.getLocation().equalsIgnoreCase("North Hall") || p.getLocation().equalsIgnoreCase("South Hall")) && p.getLearning() >= 6){
			p.incrQuality(5);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			p.setLocation("Student Parking");
			p.movePlayer();
			passFail=false;
		}
	}
	
}
