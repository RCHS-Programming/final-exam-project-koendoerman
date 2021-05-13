import greenfoot.*;
public class Background extends World
{
    public Background()
    {    
        super(800, 800, 1); 
        
        addObject ( new Hunter (), 200, 200);
        
        addObject ( new Bullet (), 200, 200);
        
        addObject ( new Deer (), 600, 600);
        
        addObject ( new Bush (), 550, 650);
        addObject ( new Bush (), 600, 650);
        addObject ( new Bush (), 550, 625);
        
        addObject ( new Bush (), 225, 250);
        addObject ( new Bush (), 600, 650);
        addObject ( new Bush (), 550, 625);
        
        
    }
}
