import greenfoot.*;
public class Deer extends Actor
{
    public Deer()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 300, image.getHeight() - 300);
        setImage(image);
    }
    
    public void act() 
    {
        moveWhenShot();
        turnAtEdge();
        move();
    }
    
    public void move()
    {
        move(3);
        
    }
    
        public void turnAtEdge() 
    {
        if( isAtEdge() )
        {
            setLocation(0, 600);
        }  
    }  
    
    public void moveWhenShot()
    {
        if( isTouching (Bullet.class))
        {
            removeTouching(Deer.class);
        }
    }
}


