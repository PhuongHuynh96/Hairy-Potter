package hairyPotter;

public class CardGoalie extends Card{

	private String cardPath;
	private boolean passFail;
	public CardGoalie(){
			cardPath = "assets/images/CardGoalie.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Soccer Goalie for 1 quality point and 1 game card and passed";
		String fail= "played card Soccer Goalie for 1 quality point and 1 game card and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("George Allen Field") && p.getLearning() >= 3 && p.getCraft() >= 3){
			p.incrQuality(5);
			//1 game card
			p.addCards(d.dealDeck());
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
