package hairyPotter;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Card105 extends Card{

	private String cardPath;
	public Card105(){
			cardPath = "assets/images/Card105.png";
	}
	
	public String getCardPath(){
		return cardPath;
	}

	@Override
	public void play(Player p, Deck d) {
		if (p.getLocation().equalsIgnoreCase("ECS 302") || p.getLocation().equalsIgnoreCase("ECS 308")){
			p.incrLearning(1);
		}
		else{
			p.decrQuality(2);
		}
	}

}
