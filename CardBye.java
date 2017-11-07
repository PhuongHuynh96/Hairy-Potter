package hairyPotter;

public class CardBye extends Card{

	private String cardPath;
	public CardBye(){
			cardPath = "assets/images/CardBye.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Room of Retirement") && p.getLearning() >= 6 && p.getCraft() >= 6 && p.getIntegrity() >= 6){
			p.incrQuality(10);
		}
		else{
			p.decrQuality(2);
			//lose 1 game card 
			p.removeCard(p.getCardAt(0));
			// leave this card in room of retirement
			p.removeCard(d.drawCard());
		}
	}

}
