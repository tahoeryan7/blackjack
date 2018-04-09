
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    private String suit;
    private String rank;
    private int value;
    /**
     * Constructor for objects of class Card
     */
    public Card(int v, String s, String r)
    {
       value= v;
       suit =s;
       rank= r;
    }
    public String getRank(String rank){
        return rank;
    }
    public String getSuit(String suit){
        return suit;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public String toString() {
        return "Suit: " + this.suit + "\n"+  " Rank: " + this.rank + "\n"+ " Value: " + this.value + "\n";
    }
}
