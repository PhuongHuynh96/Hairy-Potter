package hairyPotter;

public class CardMeetDean extends Card{

	private String cardPath;
	public CardMeetDean(){
			cardPath = "assets/images/CardMeetDean.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if ((p.getLocation().equalsIgnoreCase("North Hall") || p.getLocation().equalsIgnoreCase("South Hall")) && p.getLearning() >=3
				&& p.getCraft() >=3 && p.getIntegrity() >=3){
			p.incrQuality(5);
			//get 1 game card
			p.addCards(d.dealDeck());
		}
		else{
			p.decrQuality(2);
			//discard 1 game card 
			p.removeCard(p.getCardAt(0));
		}
	}
	
}