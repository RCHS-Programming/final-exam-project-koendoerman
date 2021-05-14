import greenfoot.*;
public class Hunter extends Actor
{
    public Hunter()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 300, image.getHeight() - 300);
        setImage(image);
    }
    
    public void act() 
    {
      moveHunter();
      rotateHunter();
    }    

    public void moveHunter()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation( getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY()+5); 
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation( getX()-5, getY());            
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation( getX()+5, getY());
        }  
    }
    
    public void rotateHunter()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            turn(-4);
        }
    }
}
