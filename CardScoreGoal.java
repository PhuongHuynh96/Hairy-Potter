package hairyPotter;

public class CardScoreGoal extends Card{

	private String cardPath;
	public CardScoreGoal(){
			cardPath = "assets/images/CardScoreGoal.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("George Allen Field") && p.getCraft() >=3){
			p.incrQuality(5);
			p.incrIntegrity(1);
		}
		else{
			p.decrQuality(2);
			p.setLocation("Student Parking");
			p.movePlayer();
		}
	}
	
}
