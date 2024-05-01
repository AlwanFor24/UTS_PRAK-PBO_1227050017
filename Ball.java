import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//Penerapan Inheritance
public class Ball extends Actor
{
    int xMoveVal = 5;
    int yMoveVal = 5;
    int brickCount = 0;
    int totalBricks = 64;
    
    
    
    
    public void act()
    {
        
        //Bola Gerak Diagonal
        setLocation(getX() - xMoveVal, getY()-yMoveVal);
        
        
        
        //Bola Mantul ( Check Wall )
        if (getX() < 5 || getX() > 595 ) 
        {
            xMoveVal = xMoveVal * -1;
        }
        
        
        
        if (getY() < 5 )
        {
            yMoveVal = yMoveVal * -1;
        }
        
        
        //Bola nyetuh paddle
        Paddle p = (Paddle) getOneIntersectingObject(Paddle.class);
        if ( p != null )
        {
            //Mengubah arah bola secara vertikal
            yMoveVal = yMoveVal * -1;
        }
        
        
        //Bola nyentuh Brick
        
       Brick brick = (Brick) getOneIntersectingObject(Brick.class);
        if (brick != null) {
            // Memanggil method onHit dan HitSound ( PENERAPAN POLIMORFISM )
            brick.onHit();
            brick.HitSound();
            
            yMoveVal = yMoveVal * -1;
            // Kondisi brick hancur
            if (brick.isDestroyed()) {
                getWorld().removeObject(brick);
                totalBricks--;
            }
        }
        
        BlueBrick bluebrick = (BlueBrick) getOneIntersectingObject(BlueBrick.class);
        if (bluebrick != null) {
           // Memanggil method onHit dan HitSound ( PENERAPAN POLIMORFISM )
            bluebrick.onHit();
            bluebrick.HitSound();
            yMoveVal = yMoveVal * -1;
            // Kondisi brick hancur
            if (bluebrick.isDestroyed()) {
                getWorld().removeObject(bluebrick);
                totalBricks--;
            }
        }
        
        GreenBrick greenbrick = (GreenBrick) getOneIntersectingObject(GreenBrick.class);
        if (greenbrick != null) {
            // Memanggil method onHit ( PENERAPAN POLIMORFISM )
            greenbrick.onHit();
            greenbrick.HitSound();
            yMoveVal = yMoveVal * -1;

            // Kondisi brick hancur
            if (greenbrick.isDestroyed()) {
                getWorld().removeObject(greenbrick);
                totalBricks--;
            }
        }
        
        OrangeBrick orangebrick = (OrangeBrick) getOneIntersectingObject(OrangeBrick.class);
        if (orangebrick != null) {
            // Memanggil method onHit ( PENERAPAN POLIMORFISM )
            orangebrick.onHit();
            orangebrick.HitSound();
            yMoveVal = yMoveVal * -1;

            // Kondisi brick hancur
            if (orangebrick.isDestroyed()) {
                getWorld().removeObject(orangebrick);
                totalBricks--;
            }
        }
        
        
        if (totalBricks == 0) {
            Greenfoot.setWorld(new WinWorld());
        }
        
        
       
        
        //Bola Hilang saat nyentuh bawah
        if (getY() > 395 )
        {
            //Kurangin Nyawa
            MyWorld.lives.add(-1);
            
            if(MyWorld.lives.getValue() == 0)
            {
                Greenfoot.setWorld(new GameOver());
            }
            else
            {
                setLocation(200, 316);
                yMoveVal = Math.abs(yMoveVal);
            }
            }
        }
    }
        
            
        
        
        
    


