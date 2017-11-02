package hairyPotter;

public class CardCrash extends Card{

	private String cardPath;
	public CardCrash(){
			cardPath = "assets/images/CardCrash.png";
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
