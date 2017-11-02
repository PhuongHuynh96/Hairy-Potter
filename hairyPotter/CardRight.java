package hairyPotter;

public class CardRight extends Card{

	private String cardPath;
	public CardRight(){
			cardPath = "assets/images/CardRight.png";
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
