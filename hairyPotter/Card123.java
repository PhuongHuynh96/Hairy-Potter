package hairyPotter;

public class Card123 extends Card{

	private String cardPath;
	public Card123(){
			cardPath = "assets/images/Card123.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play() {
		System.out.println("Herro");
	}
	
	@Override 
	public boolean playerQualified(Player p){
		return false;
	}
}
