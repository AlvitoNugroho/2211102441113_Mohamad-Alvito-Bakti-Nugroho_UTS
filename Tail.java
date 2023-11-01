import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends Actor
{
    int r, g, b;
    int framecounter = 0;
    int countLength = 0;
    int SnakeLength = 1;
    
    public Tail(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r, g, b));
        getImage().fillRect(0, 0, 70, 70);
    }
    
    public void act()
    {
        framecounter++;
        if (framecounter >=5)
        {
            getWorld().removeObject(this);
        }
        
        countLength++;
        if(countLength == 0)
        {
            getWorld().removeObject(this);
            SnakeLength += 1;
        }
        if(countLength>15 && isTouching(Snake.class))
        {
            
        }
    }
}
