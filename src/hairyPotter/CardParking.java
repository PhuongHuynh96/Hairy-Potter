package hairyPotter;

public class CardParking extends Card{

	private String cardPath;
	public CardParking(){
			cardPath = "assets/images/CardParking.png";
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
