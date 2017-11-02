package hairyPotter;

public class CardBuddy extends Card{

	private String cardPath;
	public CardBuddy(){
			cardPath = "assets/images/CardBuddy.png";
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
