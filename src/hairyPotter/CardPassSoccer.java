package hairyPotter;

public class CardPassSoccer extends Card{

	private String cardPath;
	public CardPassSoccer(){
			cardPath = "assets/images/CardPassSoccer.png";
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