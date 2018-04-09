
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;  
public class Player
{
    Scanner scan= new Scanner(System.in);
    private String name;
    private double money=100.0; 
    Card cards;
    private ArrayList<Card> hand;
    private int handTotal; 
    public Player()
    {
        setName();
        setMoney();
        hand = new ArrayList<Card>();
    }
    
    public Player(String n, double m) {
        hand = new ArrayList<Card>();
        this.name = n;
        this.money = m;
    }
    public void setName() {
        System.out.println("enter your name ");
        this.name= new String(scan.next());
    }
    public void setMoney() {
        System.out.println("How much money do you have? 0-100");
        this.money = scan.nextDouble();
    }
    public double bet(){
        System.out.println("How much are you willing to bet");
        double amount= scan.nextDouble();
        return (amount);
    }
    public void hit(Card c){
        hand.add(c);
    }
    public int stay(){
        return 0;
    }
    public int handTotal(){
        int total = 0;
        
        for(Card c : hand) {
            total += c.getValue();
        }
        
        return  total;
    }
     public String toString() {
        String temp = "Your hand contains \n";
        
        for(Card c : hand) {
            temp += c.toString() + "\n";
        }
        
        temp += "\n" + "This is your hand total " + handTotal();
        
        return temp;
        
    }
}
