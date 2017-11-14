package hairyPotter;

public class CardParking extends Card{

	private String cardPath;
	private boolean passFail;
	public CardParking(){
			cardPath = "assets/images/CardParking.png";
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
		if (p.getLocation().equalsIgnoreCase("Student Parking")){
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
