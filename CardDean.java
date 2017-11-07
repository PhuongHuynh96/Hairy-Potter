package hairyPotter;

public class CardDean extends Card{

	private String cardPath;
	public CardDean(){
			cardPath = "assets/images/CardDean.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if ((p.getLocation().equalsIgnoreCase("North Hall") || p.getLocation().equalsIgnoreCase("South Hall")) && p.getLearning() >= 6){
			p.incrQuality(5);
		}
		else{
			p.decrQuality(2);
			p.setLocation("Student Parking");
			p.movePlayer();
		}
	}
	
}
