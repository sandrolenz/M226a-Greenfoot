import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Erzeugt die Krabbenwelt (den Strand). Unsere Welt hat eine Größe 
     * von 560x560 Zellen, wobei jede Zelle nur ein Pixel groß ist.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,219,363);
        Lobster lobster = new Lobster();
        addObject(lobster,452,466);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,109,134);
        Lobster lobster3 = new Lobster();
        addObject(lobster3,446,61);
        Worm worm = new Worm();
        addObject(worm,458,308);
        Worm worm2 = new Worm();
        addObject(worm2,290,91);
        Worm worm3 = new Worm();
        addObject(worm3,106,301);
        Worm worm4 = new Worm();
        addObject(worm4,277,492);
        Worm worm5 = new Worm();
        addObject(worm5,67,31);
        Worm worm6 = new Worm();
        addObject(worm6,535,141);
        Worm worm7 = new Worm();
        addObject(worm7,289,258);
        Worm worm8 = new Worm();
        addObject(worm8,77,496);
        Worm worm9 = new Worm();
        addObject(worm9,507,462);
        Worm worm10 = new Worm();
        addObject(worm10,284,162);
        worm10.setLocation(338,173);
    }
}
