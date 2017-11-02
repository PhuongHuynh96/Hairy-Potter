package hairyPotter;

public class CardDean extends Card{

	private String cardPath;
	public CardDean(){
			cardPath = "assets/images/CardDean.png";
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
