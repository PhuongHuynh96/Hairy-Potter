package hairyPotter;

public class CardElective extends Card{

	private String cardPath;
	private boolean passFail;
	public CardElective(){
			cardPath = "assets/images/CardElective.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Elective Class for 1 learning point and 1 game card and passed";
		String fail= "played card Elective Class for 1 learning point and 1 game card and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Library") && p.getLearning() >=2){
			p.incrLearning(1);
			//get 1 game card
			p.addCards(d.dealDeck());
			passFail=true;
		}
		else{
			p.decrQuality(2);
			p.decrQuality(2);
			passFail=false;
		}
	}
	
}