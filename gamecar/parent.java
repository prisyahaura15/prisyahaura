import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class parent extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * 
     */
    public void act()
    {
        /* Add your action code here.*/
    }

    /**
     * 
     */
    public void end()
    {
        if (getY ( ) >= 640 || getY ( ) <= 0) {
            getWorld ( ) . removeObject ( this );
        }
    }

    /**
     * 
     */
    public void checkdouble(Actor i)
    {
        if (i != null) {
            getWorld ( ) . removeObject ( i );
        }
    }

    /**
     * 
     */
    public void move(int speed)
    {
        setLocation ( getX ( ) , getY ( ) + speed );
    }
}
