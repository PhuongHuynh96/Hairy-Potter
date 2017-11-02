package hairyPotter;

public class Card253 extends Card{

	private String cardPath;
	public Card253(){
			cardPath = "assets/images/Card253.png";
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