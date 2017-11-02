package hairyPotter;

public class CardMeetDean extends Card{

	private String cardPath;
	public CardMeetDean(){
			cardPath = "assets/images/CardMeetDean.png";
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