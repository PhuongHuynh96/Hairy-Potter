package hairyPotter;

public class CardEnglert extends Card{

	private String cardPath;
	public CardEnglert(){
			cardPath = "assets/images/CardEnglert.png";
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