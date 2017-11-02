package hairyPotter;

public class CardScoreGoal extends Card{

	private String cardPath;
	public CardScoreGoal(){
			cardPath = "assets/images/CardScoreGoal.png";
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
