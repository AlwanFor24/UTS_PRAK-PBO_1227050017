import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//Penerapan INHERITANCE
public class Counter extends Actor
{
    //( PENERAPAN DARI ENKAPSULASI )
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int value;
    private int target;
    private String prefix;
    
    public Counter()
    {
        this(new String());
    }


     /* Inisialisasi skor dari 0 */

    public Counter(String prefix)
    {
        // (PENERAPAN ENKAPSULASI )
        background = getImage();  // get image from class
        value = 0;
        target = 0;
        this.prefix = prefix;
        updateImage();
    }
    
    /*
     * Perhitungan skor
     */
    public void act() 
    {
        if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
    }

    /* skor tambahan.*/
    public void add(int score)
    {
        target += score;
    }

    /* Return nilai skor*/
    public int getValue()
    {
        return target;
    }

    /*Tampilan skor baru */
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }
    
    /*set prefix skor */
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    /* Update image saat skor bertambah */
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
