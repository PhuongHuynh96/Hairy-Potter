package hairyPotter;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Card105 extends Card{

	private String cardPath;
	private boolean passFail;
	public Card105(){
			cardPath = "assets/images/Card105.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}
	
	@Override
	public String playLine(Player p){
		String line = "played card CECS 105 for 1 learning point and passed";
		String fail= "played card CECS 105 for 1 learning point and failed";
		if (passFail = true){
			return line;
		}
		else
			return fail;
		
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("ECS 302") || p.getLocation().equalsIgnoreCase("ECS 308")){
			p.incrLearning(1);
			passFail=true;
		}
		else{
			p.decrQuality(2);
			passFail=false;
		}
	}

}
