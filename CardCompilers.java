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
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Library")){
			p.incrLearning(1);
		}
		else{
			p.decrQuality(2);
		}
	}

}