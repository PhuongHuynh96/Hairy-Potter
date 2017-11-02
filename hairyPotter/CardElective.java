package hairyPotter;

public class CardElective extends Card{

	private String cardPath;
	public CardElective(){
			cardPath = "assets/images/CardElective.png";
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