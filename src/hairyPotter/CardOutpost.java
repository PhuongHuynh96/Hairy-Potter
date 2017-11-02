package hairyPotter;

public class CardOutpost extends Card{

	private String cardPath;
	public CardOutpost(){
			cardPath = "assets/images/CardOutpost.png";
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
