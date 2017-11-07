package hairyPotter;

public class CardGoalie extends Card{

	private String cardPath;
	public CardGoalie(){
			cardPath = "assets/images/CardGoalie.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("George Allen Field") && p.getLearning() >= 3 && p.getCraft() >= 3){
			p.incrQuality(5);
			//1 game card
			p.addCards(d.dealDeck());
			
			
		}
		else{
			p.decrQuality(2);
			p.setLocation("Student Parking");
			p.movePlayer();
		}
	}

}
