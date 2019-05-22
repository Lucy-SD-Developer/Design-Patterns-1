/*
 * This package is for course 6119 Assignment 1: Strategy Pattern
 */
package sprg2018.assignment1.lin;

/**
 * This subclass extends abstract class in the same package
 * @author Lu Lin
 */
public class GameCharacterHicks extends GameCharacter{
    
    //use the PlayBMGSpecial class to handle playGuitar
    //use PlayStop as playAct type
    public GameCharacterHicks() {
        playGuitar = new PlayBMGSpecial();
        playAct = new PlayStop();
    }
    
    public void display() {
        System.out.println("I am Hicks.");
    }
}
