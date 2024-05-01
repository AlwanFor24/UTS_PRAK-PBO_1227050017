import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//Penerapan INHERITANCE
public class MyWorld extends World
{
    public static Counter score = new Counter ();
    public static Counter lives = new Counter ();
    private static final int NUM_BRICKS = 64;
    private Bata bata;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(625, 400, 1); 
        addObject(new Paddle(), 375, 350);
        addObject(new Ball(), 350, 325);
        addObject(score, 50, 300);
        addObject(lives, 550, 300);
        score.setValue(0);
        lives.setValue(100);
        prepare();
        
    }
        
         private void prepare() {
        // Add brick ke world
        for (int y = 0; y < 8; y++)
        {
            for (int x = 0; x < 2; x++)
            {
            addObject(new Brick(),50 + x*75, 15 + y*22);
            }
        }
        
        for (int y = 0; y < 8; y++)
        {
            for (int x = 0; x < 2; x++)
            {
            addObject(new OrangeBrick(),200 + x*75, 15 + y*22);
            }
        }
        
        for (int y = 0; y < 8; y++)
        {
            for (int x = 0; x < 2; x++)
            {
            addObject(new GreenBrick(),350 + x*75, 15 + y*22);
            }
        }
        
        for (int y = 0; y < 8; y++)
        {
            for (int x = 0; x < 2; x++)
            {
            addObject(new BlueBrick(),500 + x*75, 15 + y*22);
            }
        }
        
        
    }
}

    
