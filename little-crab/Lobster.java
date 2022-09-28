import greenfoot.*;  // (World, Actor, GreenfootImage und Greenfoot)

/**
 * Hummer (Lobster). Hummer leben am Strand. Sie fressen gerne Krabben. (Na ja, 
 * zumindest in unserem Spiel ...) 
 * 
 * Version: 2
 * 
 * Der Hummer bewegt sich nach dem Zufallsprinzip. Wenn er auf eine Krabbe trifft,
 * frisst er sie. 
 * In dieser Version haben wir einen Soundeffekt hinzugefügt. 
 * Das Spiel ist beendet, wenn ein Hummer eine Krabbe frisst.
 */

public class Lobster extends Actor
{
    /**
     * Tut, was auch immer Hummer gerne tun.
     */
    public void act()
    {
        turnAtEdge();
        randomTurn();
        move(5);
        lookForCrab();
    }

    /**
     * Prüft, ob wir den Rand der Welt erreicht haben. Wenn ja, wird ein wenig gewendet; 
     * wenn nein, passiert nichts.
     */
    public void turnAtEdge()
    {
        if ( isAtEdge() ) 
        {
            turn(17);
        }
    }

    /**
     * Entscheidet nach dem Zufallsprinzip, die aktuelle Richtung zu verlassen. Dabei wird
     * um eine zufällige Gradzahl nach links oder rechts gedreht.
     */
    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) > 90) 
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }

    /**
     * Versucht eine Krabbe zu fangen; d.h. prüft, ob wir auf eine Krabbe gestoßen sind.
     * Wenn ja, wird die Krabbe aus dem Spiel entfernt und die Ausführung des Programms beendet.
     */
    public void lookForCrab()
    {
        if ( isTouching(Crab.class) ) 
        {
            removeTouching(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}
