package hairyPotter;

public class CardHoffman extends Card{

	private String cardPath;
	public CardHoffman(){
			cardPath = "assets/images/CardHoffman.png";
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