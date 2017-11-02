package hairyPotter;

public class CardNature extends Card{

	private String cardPath;
	public CardNature(){
			cardPath = "assets/images/CardNature.png";
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
