import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame extends World
{
    int framecounter;
    public Score score = new Score();

    /**
     * Constructor for objects of class SnakeGame.
     * 
     */
    public SnakeGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1360, 768, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Snake snake = new Snake(100, 0, 0);
        addObject(snake,769,377);
        addObject(score,48,30);
        score.setLocation(76,24);
        addFood();
    }
    
    public void act()
    {
        framecounter++;
        if(framecounter > 600)  
        {
        addFood();
        }
        System.out.println("hello");
    
    }
    
    public void addFood()
    {
        addObject(new Food(), Greenfoot.getRandomNumber(getWidth()-1), Greenfoot.getRandomNumber(getHeight()-1));
        framecounter = 0;
    }
}
