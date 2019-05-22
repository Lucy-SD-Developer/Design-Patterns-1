/*
 * This package is for course 6119 Assignment 1: Strategy Pattern
 */
package sprg2018.assignment1.lin;

/**
 * This subclass extends abstract class in the same package
 * @author Lu Lin
 */
public class GameCharacterThomas extends GameCharacter{
    
    //use the PlayGibsonFlying class to handle playGuitar
    //use PlayBreak as playAct type
    public GameCharacterThomas() {
        playGuitar = new PlayGibsonFlying();
        playAct = new PlayBreak();
    }
    
    public void display() {
        System.out.println("I am Thomas.");
    }    
}
