import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class ambulan extends Actor
{
  int score = 0;
  public GreenfootSound sirine = new GreenfootSound("soundsirine.mp3");
    public void act() 
    {
        getWorld().showText("Score : " + score, 70, 30);
        checkKey();
        end();
        addscore();
        sirine.setVolume(70);
        sirine.play();
    }    
    
    public void checkKey(){
        if(Greenfoot.isKeyDown("left")){
            if(getX()>= 80 ){
                setLocation(getX() -4, getY());
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<= 450 ){
                setLocation(getX() +4, getY());
            }
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY() -5);
        }  
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY() +5);
        } 
    }
    
    public void end(){
        if(isTouching(greencar.class)||isTouching(redcar.class)){
            getWorld().showText("Game Over \n Score Anda : " + score, 300, 200);
            getWorld().addObject(new restart(),300,170);
            
            sirine.stop();
            
            
        }
    }
    
    public void addscore(){
        if(isTouching(coin.class)){
            score = score + 100;
            removeTouching(coin.class);
        }
    }
}
