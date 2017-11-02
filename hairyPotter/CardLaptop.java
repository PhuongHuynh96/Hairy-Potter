package hairyPotter;

public class CardLaptop extends Card{

	private String cardPath;
	public CardLaptop(){
			cardPath = "assets/images/CardLaptop.png";
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