package hairyPotter;

public class Card151 extends Card{

	private String cardPath;
	public Card151(){
			cardPath = "assets/images/Card151.png";
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
