import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//Penerapan INHERITANCE
public class Paddle extends Actor
{
    
   
 public void act()
{
    // Inisialisasi Mouse
    if (Greenfoot.mouseMoved(null))
    {
        // world objek
        World world = getWorld();
        
        // kondisi inputan external
        if (world != null)
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            
            // Kondisi Mouse digerakkan
            if (mouse != null)
            {
                // Pergerakan mouse koordinat X
                int newX = mouse.getX();
                // Menjaga mouse tidak bergerak secara vertikal
                int newY = getY(); 
                
                // Set new location
                setLocation(newX, newY);
            }
        }
    }
}
}
