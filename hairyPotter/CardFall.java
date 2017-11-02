package hairyPotter;

public class CardFall extends Card{

	private String cardPath;
	public CardFall(){
			cardPath = "assets/images/CardFall.png";
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
