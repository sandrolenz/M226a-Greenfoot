import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Die Blutbahn ist der Schauplatz für unser Szenario "White Blood Cell". 
 * Es ist der Ort, an dem Blutzellen, Bakterien und Viren herumschwimmen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Bloodstream extends World
{
    private int score;
    private int time;
    /**
     * Konstruktor: die Anfangsobjekte einrichten.
     */
    public Bloodstream()
    {    
        super(780, 360, 1); 
        setPaintOrder(Border.class);
        score = 0;
        showScore();
        time = 2000;
        showTime();

        prepare();
    }
    
    /**
     * Erzeugt neue herumschwimmende Objekte in unregelmäßgen Abständen. 
     */
    public void act()
    {
        countTime();
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Lining(), 779, 0);
        }
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Lining(), 779, 359);
        }
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Virus(), 779, Greenfoot.getRandomNumber(360));
        }
        
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new Bacteria(), 779, Greenfoot.getRandomNumber(360));
        }
        
        if (Greenfoot.getRandomNumber(100) < 6)
        {
            addObject(new RedCell(), 779, Greenfoot.getRandomNumber(360));
        }
    }

    public void addScore(int points) {
        score = score + points;
        showScore();
        
        if (score < 0) {
            Greenfoot.playSound("game-over.wav");
            showEndMessage(false);
            Greenfoot.stop();
        }
    }
    
    private void showScore() {
        showText("Score: " + score, 80, 25);
    }
    
    private void showTime() {
        showText("Time: " + time, 80, 50);
    }
    
    private void countTime() {
        time = time - 1;
        showTime();
        
        if (time == 0) {
            showEndMessage(true);
            Greenfoot.stop();
        }
    }
    
    private void showEndMessage(boolean win) {
        if (win) {
            showText("Zeit abgelaufen - Du hast gewonnen!", 390, 170);
            showText("Punktzahl: " + score, 390, 190);
        } else {
            showText("Du hast verloren!", 390, 170);
            showText("Punktzahl: " + score, 390, 190);
        }
    }
    
    /**
     * Bereitet die Welt für den Programmstart vor. In diesem Fall: Erzeugt 
     * eine weiße Blutzelle und die Begrenzung an den Rändern der Blutbahn.
     */
    private void prepare()
    {
        WhiteCell whitecell = new WhiteCell();
        addObject(whitecell, 100, 179);
        Lining lining = new Lining();
        addObject(lining, 126, 1);
        Lining lining2 = new Lining();
        addObject(lining2, 342, 5);
        Lining lining3 = new Lining();
        addObject(lining3, 589, 2);
        Lining lining4 = new Lining();
        addObject(lining4, 695, 5);
        Lining lining5 = new Lining();
        addObject(lining5, 114, 359);
        Lining lining6 = new Lining();
        Lining lining7 = new Lining();
        addObject(lining7, 295, 353);
        Lining lining8 = new Lining();
        Lining lining9 = new Lining();
        Lining lining10 = new Lining();
        addObject(lining10, 480, 358);
        Lining lining11 = new Lining();
        addObject(lining11, 596, 359);
        Lining lining12 = new Lining();
        addObject(lining12, 740, 354);
        Border border = new Border();
        addObject(border, 0, 180);
        Border border2 = new Border();
        addObject(border2, 770, 180);
    }
}
