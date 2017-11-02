package hairyPotter;

public abstract class Card {

	public abstract boolean playerQualified(Player p);
	public abstract void play();
	public abstract String getCardPath();
}
