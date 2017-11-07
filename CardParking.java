package hairyPotter;

public class CardParking extends Card{

	private String cardPath;
	public CardParking(){
			cardPath = "assets/images/CardParking.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Student Parking")){
			p.incrCraft(1);
			p.setLocation("Lactation Lounge");
			p.movePlayer();
		}
		else{
			p.decrQuality(2);
		}
	}

}
