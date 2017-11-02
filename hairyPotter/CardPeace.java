package hairyPotter;

public class CardPeace extends Card{

	private String cardPath;
	public CardPeace(){
			cardPath = "assets/images/CardPeace.png";
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
