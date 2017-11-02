package hairyPotter;

public class CardComm extends Card{

	private String cardPath;
	public CardComm(){
			cardPath = "assets/images/CardComm.png";
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