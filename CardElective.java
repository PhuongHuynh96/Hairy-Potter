package hairyPotter;

public class CardElective extends Card{

	private String cardPath;
	public CardElective(){
			cardPath = "assets/images/CardElective.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Library") && p.getLearning() >=2){
			p.incrLearning(1);
			//get 1 game card
			p.addCards(d.dealDeck());
		}
		else{
			p.decrQuality(2);
			p.decrQuality(2);
		}
	}
	
}