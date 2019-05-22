/*
 * This package is for course 6119 Assignment 1: Strategy Pattern
 */
package sprg2018.assignment1.lin;

/**
 * This is an abstract class for assignment 1
 * @author Lu Lin
 */
public abstract class GameCharacter {
    //declare two reference variables for the interface types
    PlayGuitar playGuitar;
    PlayAct playAct;
    
    //constructor
    public GameCharacter() {
        
    }
    
    public abstract void display();
    
    //delegate to the play guitar class
    public void playGuitar() {
        playGuitar.playOneOfTwoDifferentGuitars();
    }
    
    //delegate to the play act class
    public void playAct() {
        playAct.playOneUniqueAct();
    }
    
}
