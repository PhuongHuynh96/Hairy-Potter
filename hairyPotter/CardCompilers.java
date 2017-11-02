package hairyPotter;

public class CardCompilers extends Card{

	private String cardPath;
	public CardCompilers(){
			cardPath = "assets/images/CardCompilers.png";
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