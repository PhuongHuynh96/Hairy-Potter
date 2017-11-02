package hairyPotter;

public class CardBratwurst extends Card{

	private String cardPath;
	public CardBratwurst(){
			cardPath = "assets/images/Bratwurst.png";
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
