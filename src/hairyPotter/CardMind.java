package hairyPotter;

public class CardMind extends Card{

	private String cardPath;
	public CardMind(){
			cardPath = "assets/images/CardMind.png";
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
