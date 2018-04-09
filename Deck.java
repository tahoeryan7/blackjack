
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;
public class Deck
{
    private ArrayList<Card> deck = new ArrayList<Card>();
    
    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        shuffle();
        deal();
        initializeDeck();
    }
    public void initializeDeck(){
        String [] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        
        for( String s : suits){
            int value=1; 
            for(String r: ranks){
                Card temp= new Card(value, s ,r);
                value++;
                if(value > 10) value = 10;
                deck.add(temp);
            }
        }
    }
    public void shuffle(){
        Random ran= new Random();
        initializeDeck();
    }
    public Card deal(){
        Random ran= new Random();
        int index = ran.nextInt(deck.size());
        return deck.remove(index);
        
    }
}
