
/**
 * A pet stone.
 *
 * @author Linda Fernsel
 * @version 1.0.0
 */
public class Stone implements Pet
{
    String name;

    /**
     * Constructor for objects of class Stone
     */
    public Stone(String name)
    {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void sayName() {
        System.out.println("Duh I can't talk");
    }
}
