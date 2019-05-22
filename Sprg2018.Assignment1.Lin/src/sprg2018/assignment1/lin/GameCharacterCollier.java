/*
 * This package is for course 6119 Assignment 1: Strategy Pattern
 */
package sprg2018.assignment1.lin;

/**
 * This subclass extends abstract class in the same package
 * @author Lu Lin
 */
public class GameCharacterCollier extends GameCharacter{
    
    //use the PlayGibsonFlying class to handle playGuitar
    //use PlayTwoGuitarsSimultaneously as playAct type
    public GameCharacterCollier() {
        playGuitar = new PlayGibsonFlying();
        playAct = new PlayTwoGuitarsSimultaneously();
    }
    
    public void display() {
        System.out.println("I am Collier.");
    }
}
