package hairyPotter;

public abstract class Card {

	public abstract void play(Player p, Deck d);
	public abstract String playLine(Player p);
	public abstract String getCardPath();
}
