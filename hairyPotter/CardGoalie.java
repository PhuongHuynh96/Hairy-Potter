package hairyPotter;

public class CardGoalie extends Card{

	private String cardPath;
	public CardGoalie(){
			cardPath = "assets/images/CardGoalie.png";
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
