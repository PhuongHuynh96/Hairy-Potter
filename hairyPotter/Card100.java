package hairyPotter;

public class Card100 extends Card{

	private String cardPath;
	public Card100(){
			cardPath = "assets/images/Card100.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play() {

	}
	
	@Override 
	public boolean playerQualified(Player p){
		return false;
	}

}
