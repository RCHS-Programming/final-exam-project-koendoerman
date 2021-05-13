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
        move();
        turnAtEdge();
    }
    
    public void move()
    {

    }
    
    public void turnAtEdge() 
    {
        if( isAtEdge() )
        {
            turn(17);
        }  
    }

}
