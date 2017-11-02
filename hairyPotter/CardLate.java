package hairyPotter;

public class CardLate extends Card{

	private String cardPath;
	public CardLate(){
			cardPath = "assets/images/CardLate.png";
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