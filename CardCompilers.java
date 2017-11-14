package hairyPotter;

public class CardCompilers extends Card{

	private String cardPath;
	private boolean passFail;
	public CardCompilers(){
			cardPath = "assets/images/CardCompilers.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card Research Compilers for 1 learning point and passed";
		String fail= "played card Research Compilers for 1 learning point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("Library")){
			p.incrLearning(1);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			passFail=false;
		}
	}

}