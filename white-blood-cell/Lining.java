import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Die Objekte für die Wandverkleidung - Lining - sind Objekte an den Rändern der Vene. 
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Lining extends Actor
{
    /**
     * Aktion - Langsam nach links bewegen.
     */
    public void act() 
    {
        setLocation(getX()-2, getY());
        
        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }    
}
