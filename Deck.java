package hairyPotter;

import java.util.Collections;
import java.util.Arrays;

public class Deck {

	private Card cards[];
	private int count;
	private int discardCount;
	private final int AMOUNT_OF_CARDS = 40;

	public Deck() {
		cards = new Card[AMOUNT_OF_CARDS];
		resetDeck();
	}

	public Card dealDeck() {
		return cards[count++];
	}
	
	public Card drawCard(){
		return cards[count];
	}

	public void shuffle() {
		Collections.shuffle(Arrays.asList(cards));
	}

	public void resetDeck() {
		count = 0;
		discardCount = 0;
		cards[0] = new Card100();
		cards[1] = new Card105();
		cards[2] = new Card111();
		cards[3] = new Card122();
		cards[4] = new Card123();
		cards[5] = new Card151();
		cards[6] = new Card253();
		cards[7] = new CardBigGame();
		cards[8] = new CardBratwurst();
		cards[9] = new CardBuddy();
		cards[10] = new CardBuzzing();
		cards[11] = new CardBye();
		cards[12] = new CardComm();
		cards[13] = new CardCompilers();
		cards[14] = new CardCrash();
		cards[15] = new CardDean();
		cards[16] = new CardElective();
		cards[17] = new CardEnglert();
		cards[18] = new CardFall();
		cards[19] = new CardFindLab();
		cards[20] = new CardFriend();
		cards[21] = new CardGoalie();
		cards[22] = new CardHoffman();
		cards[23] = new CardLaptop();
		cards[24] = new CardLate();
		cards[25] = new CardMajor();
		cards[26] = new CardMeetDean();
		cards[27] = new CardMind();
		cards[28] = new CardMurgolo();
		cards[29] = new CardNature();
		cards[30] = new CardNetbeans();
		cards[31] = new CardOutpost();
		cards[32] = new CardParking();
		cards[33] = new CardPassSoccer();
		cards[34] = new CardPeace();
		cards[35] = new CardRight();
		cards[36] = new CardScoreGoal();
		cards[37] = new CardViolation();
		cards[38] = new CardLinux();
		shuffle();
	}

	public int cardsLeft() {
		return AMOUNT_OF_CARDS - count;
	}

	public void incrDiscard() {
		discardCount++;
	}
	
	public int getDiscardCount(){
		return discardCount;
	}

}
