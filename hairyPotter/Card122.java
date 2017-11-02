package hairyPotter;

public class Card122 extends Card{

	private String cardPath;
	public Card122(){
			cardPath = "assets/images/Card122.png";
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
