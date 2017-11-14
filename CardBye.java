package hairyPotter;

public class CardBye extends Card{

	private String cardPath;
	private boolean passFail;
	public CardBye(){
			cardPath = "assets/images/CardBye.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card GoodBye Professor for 10 quality points and passed";
		String fail= "played card GoodBye Professor for 10 quality points and failed";
		if (p.getName().equalsIgnoreCase("Gary")){
			fail="played card GoodBye Professor for 10 quality points and failed. A card was removed from hand.";
		}
		
		else if (passFail=false){
			return fail;
		}
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Room of Retirement") && p.getLearning() >= 6 && p.getCraft() >= 6 && p.getIntegrity() >= 6){
			p.incrQuality(10);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			//lose 1 game card 
			p.removeCard(p.getCardAt(0));
			// leave this card in room of retirement
			p.removeCard(d.drawCard());
			passFail=false;
		}
	}

}
