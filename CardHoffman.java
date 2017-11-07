package hairyPotter;

public class CardHoffman extends Card{

	private String cardPath;
	public CardHoffman(){
			cardPath = "assets/images/CardHoffman.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if ((p.getLocation() != "Lactation Lounge") && (p.getLocation().equalsIgnoreCase("ECS 302") || p.getLocation().equalsIgnoreCase("ECS 308") ||
				p.getLocation().equalsIgnoreCase("EAT Club") || p.getLocation().equalsIgnoreCase("CECS Conference Room") || p.getLocation().equalsIgnoreCase("South Hall") ||
				p.getLocation().equalsIgnoreCase("Elevators") || p.getLocation().equalsIgnoreCase("Room of Retirement") || p.getLocation().equalsIgnoreCase("North Hall") ||
				p.getLocation().equalsIgnoreCase("Computer Lab")) && p.getLearning() >=3){
			p.incrQuality(5);
			//get 2 game cards
			p.addCards(d.dealDeck());
			p.addCards(d.dealDeck());
		}
		else{
			p.decrQuality(2);
			p.decrQuality(5);
			p.setLocation("Lactation Lounge");
			p.movePlayer();
		}
	}
	
}