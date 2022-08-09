import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class greencar extends parent
{
    int speed = 3;
    
    public void act() 
    {
        greencar a = new greencar();
        Actor i = getOneIntersectingObject(greencar.class);
        move(speed);
        checkdouble(i);
        end();
    }    
}
