package hairyPotter;

public class CardViolation extends Card{

	private String cardPath;
	public CardViolation(){
			cardPath = "assets/images/CardViolation.png";
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