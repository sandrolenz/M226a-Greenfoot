import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus here.
 * 
 * @author Sandro Lenz
 * @version 06.09.2022
 */
public class Virus extends Actor
{
    /**
     * Act - Move from right to left and rotate
     */
    public void act()
    {
        setLocation(getX()-4, getY());
        turn(-1);
        
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
}
