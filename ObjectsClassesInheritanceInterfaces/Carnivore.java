
/**
 * A Carnivore is an animal that eats meat.
 *
 * @author Linda Fernsel
 * @version 1.0.0
 */
public class Carnivore implements Animal //we say we want to implement the Animal interface
{
  
    /**
     * Constructor for objects of class Carnivore
     */
    public Carnivore()
    {
        
    }

    // What happens if you comment out one of the following methods?
    /**
     * A method that lets the Carnivore eat.
     *
     * @param  food  what kind of food the Carnivore receives to eat
     */
    public void eat(String food)
    {
        if(food.equals("meat")) {
            System.out.println("Yummy, meat!");
        } else {
            System.out.println("Yikes, who would eat " + food + "? Not me!");
        }
    }
    
    public void sleep(int hours) {
        System.out.println("I am tired...");
        for(int i = 1; i <= hours; i++) {
            System.out.println("..rhoo pshuu...");
        }
    }

    public void speak(){
        System.out.println("Rawr");
    }
}
