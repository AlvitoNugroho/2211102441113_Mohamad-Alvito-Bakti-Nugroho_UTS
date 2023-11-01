import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    int speed = 7;
    int r, g, b;
    int count = 0;
    public Snake(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b; 
        getImage().setColor(new Color(r, g, b));
        getImage().fillRect(0, 0, 70, 70);
    }
    
    public void act()
    {
        count++;
        getWorld().addObject(new Tail(r, g, b), getX(), getY());
        move(speed);
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
        }
        eatFood();
    }
    
    public void eatFood()
    {
        if(isTouching(Food.class))
        {
            SnakeGame snakegame = (SnakeGame) getWorld();
            snakegame.addFood();
        }
    }
}
