 import java.util.*;
import java.util.Arrays;


enum Suit {
  SPADES,
  HEARTS,
  CLUBS,
  DIAMONDS
}

class Card {
  public Card(Suit s, int n) {
    suit = s;
    if((n < 2) || (n > 14)) {
      throw new IllegalArgumentException( );
    }
    number = n;
  }

  public void print( ) {
    switch(number) {
      case 11:
        System.out.print("Jack");
        break;
      case 12:
        System.out.print("Queen");
        break;
      case 13:
        System.out.print("King");
        break;
      case 14:
        System.out.print("Ace");
        break;
      default:
        System.out.print(number);
        break;
    }
    System.out.print(" of ");
    switch(suit) {
      case SPADES:
        System.out.println("spades.");
        break;
      case HEARTS:
        System.out.println("hearts.");
        break;
      case CLUBS:
        System.out.println("clubs.");
        break;
      case DIAMONDS:
        System.out.println("diamonds.");
        break;
    }
  }

  private Suit suit;
  private int number;
}


class Deck {
	
	private volatile static Deck uniqueInstance = null;
	private List<Card> cards = new ArrayList<Card>( );
  	//build the deck
  	private Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS};

  	// private constructor - only Deck() can instantiate this class
	private Deck( ) {}
  
	
	// instantiate class and return an instance of it
	public static Deck getInstance() {
		
		if(uniqueInstance == null) { // check 1 if instance was created
		  
			// Here we just use synchronized when the first object is created
			// to manage all calls to the Deck getInstance to wait their turn
			synchronized(Deck.class){
				// If the instance isn't needed it isn't created
				// This is known as lazy instantiation
				if(uniqueInstance == null) { // check 2 if instance was created
					uniqueInstance = new Deck();
				}
			}
		}
		return uniqueInstance;
	}
	   
  	// shuffle it!
	Collections.shuffle(cards, new Random( ));
  
  	for(Suit suit: suits) {
  		for(int i = 2; i <= 14; i++) {
  			cards.add(new Card(suit, i));
  		}
  	}

  	public List<Card> getCards(){
  		return uniqueInstance.cards;
  	}
  
  	public void print( ) {
  		for(Card card: cards) {
  			card.print( );
  		}
  	}
}

public class SingletonExercise {
  public static void main(String args[]) {
    Deck deck = new Deck( );
    deck.print( );
  }
}
