/*
 * This package is for course 6119 Assignment 1: Strategy Pattern
 */
package sprg2018.assignment1.lin;

/**
 * This subclass extends abstract class in the same package
 * @author Lu Lin
 */
public class GameCharacterDenial extends GameCharacter{
    
    //use the PlayBMGSpecial class to handle playGuitar
    //use PlayMoveAround as playAct type
    public GameCharacterDenial () {
        playGuitar = new PlayBMGSpecial();
        playAct = new PlayMoveAround();
    }
    
    public void display() {
        System.out.println("I am Denial.");
    }
}
