package hairyPotter;

public class CardBigGame extends Card{

	private String cardPath;
	public CardBigGame(){
			cardPath = "assets/images/CardBigGame.png";
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
