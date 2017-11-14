package hairyPotter;

public class CardMeetDean extends Card{

	private String cardPath;
	private boolean passFail;
	public CardMeetDean(){
			cardPath = "assets/images/CardMeetDean.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Meet the Dean for 5 quality points and 1 game card and passed";
		String fail= "played card Meet the Dean for 5 quality points and 1 game card and failed";
		if (p.getName().equalsIgnoreCase("Gary")){
			fail="played card Meet the Dean for 1 random point and failed. A card was removed from hand.";
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
		if ((p.getLocation().equalsIgnoreCase("North Hall") || p.getLocation().equalsIgnoreCase("South Hall")) && p.getLearning() >=3
				&& p.getCraft() >=3 && p.getIntegrity() >=3){
			p.incrQuality(5);
			//get 1 game card
			p.addCards(d.dealDeck());
			passFail=true;
		}
		else{
			p.decrQuality(2);
			//discard 1 game card 
			p.removeCard(p.getCardAt(0));
			passFail=false;
		}
	}
	
}