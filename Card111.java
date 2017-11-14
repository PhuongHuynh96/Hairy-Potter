package hairyPotter;

public class Card111 extends Card{

	private String cardPath;
	private boolean passFail;
	public Card111(){
			cardPath = "assets/images/Card111.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card CHEM 111 for 5 quality points and passed";
		String fail= "played card CHEM 111 for 5 quality points and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if ((p.getLocation() != "ECS 308" && p.getLocation() != "ECS 302") && p.getCraft() >= 6){
			p.incrQuality(5);
			passFail=true;
		}
		else {
			p.decrQuality(2);
			p.setLocation("Student Parking");
			p.movePlayer();
			passFail=false;
			
		}
	}
	
}