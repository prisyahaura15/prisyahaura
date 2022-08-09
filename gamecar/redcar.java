import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class redcar extends parent
{
    int speed = 4;
    public void act() 
    {
        redcar a = new redcar();
        Actor i = getOneIntersectingObject(greencar.class);
        move(speed);
        checkdouble(i);
        end();
    }    
}
