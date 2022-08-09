import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

  
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(599, 650, 1); 
        prepare();
    }
    
    
    private void prepare()
    {
        ambulan ambulan = new ambulan();
        addObject(ambulan,272,334);
        tree tree = new tree();
        addObject(tree,492,364);
        tree tree2 = new tree();
        addObject(tree2,489,300);
        tree tree3 = new tree();
        addObject(tree3,488,235);
        tree tree4 = new tree();
        addObject(tree4,487,171);
        tree tree5 = new tree();
        addObject(tree5,486,107);
        tree tree6 = new tree();
        addObject(tree6,485,38);
        people people = new people();
        addObject(people,527,38);
        people people2 = new people();
        addObject(people2,528,157);
        people people3 = new people();
        addObject(people3,526,247);
        people people4 = new people();
        addObject(people4,525,328);
        people people5 = new people();
        addObject(people5,527,103);
        people2.setLocation(526,177);
        people3.setLocation(523,253);
        people2.setLocation(523,181);
        people5.setLocation(521,127);
        removeObject(people4);
        removeObject(people3);
        removeObject(people2);
        removeObject(people5);
        removeObject(people);
        tree.setLocation(495,617);
        tree.setLocation(495,617);
        tree.setLocation(487,574);
        tree2.setLocation(488,452);
        tree3.setLocation(493,341);
        tree4.setLocation(486,252);
        tree5.setLocation(487,128);
        tree2.setLocation(490,474);
        tree.setLocation(493,593);
        tree2.setLocation(499,483);
        tree3.setLocation(497,349);
        tree4.setLocation(495,224);
        tree5.setLocation(492,137);
        tree6.setLocation(493,46);
        ambulan.setLocation(259,539);
        ambulan.setLocation(269,539);
        tree3.setLocation(498,344);
        tree4.setLocation(494,254);
        tree2.setLocation(499,458);
        tree3.setLocation(494,344);
        tree4.setLocation(497,260);
        tree5.setLocation(497,153);
        tree6.setLocation(498,66);
        tree.setLocation(494,619);
        tree2.setLocation(495,485);
        tree3.setLocation(492,384);
        tree3.setLocation(494,392);
        play play = new play();
        addObject(play,273,525);
        removeObject(play);
    }
    
    public void act(){
        
        
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new greencar(),Greenfoot.getRandomNumber (400) + 50, 0);
        }
        if(Greenfoot.getRandomNumber(300)<1){
            addObject(new redcar(),Greenfoot.getRandomNumber (400) + 50, 0);
        }
         if(Greenfoot.getRandomNumber(300)<1){
            addObject(new coin(),Greenfoot.getRandomNumber (400) + 50, 0);
        }
         if(Greenfoot.getRandomNumber(200)<1){
            addObject(new people(),Greenfoot.getRandomNumber (80) + 510, 0);
        }
        
    }
    
    
}
