package hairyPotter;

public class CardFriend extends Card{

	private String cardPath;
	public CardFriend(){
			cardPath = "assets/images/CardFriend.png";
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