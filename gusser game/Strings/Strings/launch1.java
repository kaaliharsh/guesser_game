package Strings;
import java.util.*;
import javax.lang.model.util.ElementScanner6;

class Gusser {
    int guessnum;

    int guessingnumber(){ 
      
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser ! Kindly guess the number");
        guessnum =scan.nextInt();
        return guessnum;        

    }
}
  

class Player {
    int guessnum;

    int guessingnumber(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Player kindly guess the number..");
        guessnum=scan.nextInt();
        return guessnum;
    }
}


class umpire {

    int numfromguesser;
    int numfromplayer1;
    int numfromplayer2;
    int numfromplayer3;

    void collectnumfromguesser() {

        Gusser g = new Gusser();
        numfromguesser = g.guessingnumber();
    }
    

    void collectnumfromplayers() {

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numfromplayer1 = p1.guessingnumber();
        numfromplayer2 = p2.guessingnumber();
        numfromplayer3 = p3.guessingnumber();

    }

    void compare() {

        if (numfromguesser == numfromplayer1) 
        {
            if (numfromguesser == numfromplayer2 && numfromguesser == numfromplayer3) 
            {
                System.out.println("All are Winners");
            }
            else if(numfromguesser==numfromplayer2)
            {
                System.out.println("Player 1 and plater 2 are winners....");
            }
            else if(numfromguesser==numfromplayer3)
            {
                System.out.println("Player 1 and Player 3 are winners....");
            }
            else
            {
                System.out.println("Player 1 is won the game....");
            }
       }

        else if (numfromguesser == numfromplayer2) 
        {
            if (numfromguesser == numfromplayer3) 
            {
                System.out.println("Player 2 and player 3 are winners...");
            } 
            else 
            {
                System.out.println("Player 2 is won the game....");
            }
        }

        else if (numfromguesser == numfromplayer3) 
        {
            System.out.println("Player 3 is won the game....");
        }
        else 
        {
            System.out.println("Noone is win");
        }
    }
}

public class launch1 {

    public static void main(String args[]) {
        System.out.println("\n\n******    Game started    ******\n");
        System.out.println("This Game consist for only 3 players !\n");
        umpire u = new umpire();
        u.collectnumfromguesser();
        u.collectnumfromplayers();
        u.compare();
    }

}
