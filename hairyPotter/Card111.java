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
	public void play() {
		System.out.println("Herro");
	}
	
	@Override 
	public boolean playerQualified(Player p){
		return false;
	}
}