/*
 * This package is for course 6119 Assignment 1: Strategy Pattern
 */
package sprg2018.assignment1.lin;

/**
 * This is a main class
 * @author Lu Lin
 */
public class GuitarHeroIII_Lin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameCharacter player1 = new GameCharacterCollier();
        player1.playGuitar();
        player1.playAct();        
        player1.display();
        
        
        GameCharacter player2 = new GameCharacterDenial();
        player2.playGuitar();
        player2.playAct();        
        player2.display();
        
        GameCharacter player3 = new GameCharacterHicks();
        player3.playGuitar();
        player3.playAct();        
        player3.display();
        
        GameCharacter player4 = new GameCharacterSmith();
        player4.playGuitar();
        player4.playAct();        
        player4.display();
        
        GameCharacter player5 = new GameCharacterThomas();
        player5.playGuitar();
        player5.playAct();        
        player5.display();
    }
    
}
