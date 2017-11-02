package hairyPotter;

public class CardBye extends Card{

	private String cardPath;
	public CardBye(){
			cardPath = "assets/images/CardBye.png";
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
