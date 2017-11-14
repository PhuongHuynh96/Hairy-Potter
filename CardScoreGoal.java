package hairyPotter;

public class CardScoreGoal extends Card{

	private String cardPath;
	private boolean passFail;
	public CardScoreGoal(){
			cardPath = "assets/images/CardScoreGoal.png";
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
		if (p.getLocation().equalsIgnoreCase("George Allen Field") && p.getCraft() >=3){
			p.incrQuality(5);
			p.incrIntegrity(1);
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
