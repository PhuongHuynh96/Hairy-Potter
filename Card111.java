package hairyPotter;

public class Card111 extends Card{

	private String cardPath;
	public Card111(){
			cardPath = "assets/images/Card111.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if ((p.getLocation() != "ECS 308" && p.getLocation() != "ECS 302") && p.getCraft() >= 6){
			p.incrQuality(5);
		}
		else {
			p.decrQuality(2);
			p.setLocation("Student Parking");
			p.movePlayer();
			
		}
	}
	
}