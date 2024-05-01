import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//Penerapan Interface 
interface HitBrick {
    public void onHit();
    public void HitSound ();

}

//Penerapan INHERITANCE
public class Bata extends Actor implements HitBrick {
    //Brick punya 3 nyawa
    public int health = 3;
    

    public Bata() {

    }

    public Bata(int health, int totalBricks) {
        this.health = health;
    }

    
    public  void onHit(){
        // Reduce brick's health when hit by a ball
        health--;
        MyWorld.score.add(10);
    }
    

    public boolean isDestroyed() {
    // Brick hancur
    if (health <= 0) {
        return true; // Return true artinya brick is hancur
    } else {
        return false; //Brick tidak hancur
    }
}
    
    
    public void HitSound(){
        //Suara saat bola nyentuh brick
        Greenfoot.playSound("brick-dropped-on-other-bricks-14722.mp3");
    }
    
    public static void main(String[] args) {
    Bata bata = new Bata();
    bata.onHit();
    bata.HitSound();
  }
    
}


