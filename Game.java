
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Game
{
    Scanner scan= new Scanner(System.in);
    Deck d = new Deck();
    Player pOne; 
    Dealer dOne;
    public Game()
    {
       System.out.println("welcome to blackjack");
       pOne = new Player(); 
       dOne = new Dealer();
       playGame();
       
    }
    public void playGame(){
        dealCard(pOne);
        dealCard(pOne);
        
        dealCard(dOne);
        dealCard(dOne);
        System.out.println(pOne);
        
        //Ask player to stay or hit and loop
        System.out.println("Enter Amount you want to bet ");
        Bet(pOne);
        
        //Hit on dealer until 17 or more
        
        
        //Determien winner
    }
    public void dealCard(Player p) {
        Card c = d.deal();
        p.hit(c);
        
        
    }
    public void Bet(Player p){
        double amount =  p.bet();
    }
    public String determineWinner(){ 
        return null;
    }
    public void endGame(){
        
    }
    
   
}
