package hairyPotter;

public class CardMurgolo extends Card{

	private String cardPath;
	public CardMurgolo(){
			cardPath = "assets/images/CardMurgolo.png";
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

