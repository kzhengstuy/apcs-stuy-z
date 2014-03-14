import info.gridworld.actor.Actor; 
import info.gridworld.actor.Flower; 
import info.gridworld.actor.Rock; 
import info.gridworld.grid.Grid; 
import info.gridworld.grid.Location; 
 
import java.awt.Color; 
 

public class Jumper extends Actor {
    
    public Jumper() 
    { setColor(Color.RED); } 
    
    public Jumper(Color JumperColor) 
    { 
	setColor(JumperColor); 
    } 
    
    public void act() 
    { 
	if (canJump()) 
	    jump(); 
	else 
	    turn(); 
    } 
     
    public void turn() 
    { 
	setDirection(getDirection() + Location.HALF_RIGHT); 
    } 
}