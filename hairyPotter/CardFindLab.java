package hairyPotter;

public class CardFindLab extends Card{

	private String cardPath;
	public CardFindLab(){
			cardPath = "assets/images/CardFindLab.png";
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
