package hairyPotter;

public class CardNetbeans extends Card{

	private String cardPath;
	public CardNetbeans(){
			cardPath = "assets/images/CardNetbeans.png";
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
