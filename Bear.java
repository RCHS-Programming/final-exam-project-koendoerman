import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    public Bear()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 300, image.getHeight() - 250);
        setImage(image);
    }
    
    public void act() 
    {
        bearAttack();
    }   
    
    public void bearAttack()
    {
        move(-3);
        if( isTouching (Hunter.class))
        {
            Greenfoot.stop();
            
        }
        
        if( isTouching (Bullet.class))
        {
            removeTouching(Bear.class);
            
        }

    }
}
