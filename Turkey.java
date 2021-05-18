import greenfoot.*; 
public class Turkey extends Actor
{
    public Turkey()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 650, image.getHeight() - 700);
        setImage(image);
    }
    
    public void act() 
    {
        move();
        moveWhenShot();
        turnAtEdge();
    }    
    
        public void move()
    {
        move(-3);
        
    }
    
    public void turnAtEdge() 
    {
        if( isAtEdge() )
        {
            setLocation(800, 400);
        }  
    }
    
            public void moveWhenShot()
    {
        if( isTouching (Bullet.class))
        {
            removeTouching(Turkey.class);
        }
    }
}
