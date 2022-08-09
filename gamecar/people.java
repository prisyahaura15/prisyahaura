import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class people extends parent
{
    int speed = 1;
    public void act() 
    {
        people a = new people();
        Actor i = getOneIntersectingObject(people.class);
        move(speed);
        checkdouble(i);
        end();
    }    
}
