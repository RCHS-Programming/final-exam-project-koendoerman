import greenfoot.*;
public class Bullet extends Actor
{
    public Bullet()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 200, image.getHeight() - 200);
        setImage(image);
    }
    
    public void act() 
    {
        moveBullet();
        rotateBullet();
        shootGun();
        
    }    
    
   

    public void moveBullet()
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
    
    public void rotateBullet()
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
    
    public void shootGun()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            move(6);
        }
    }
}
