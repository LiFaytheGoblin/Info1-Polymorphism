
/**
 * A Cat is a Carnivore. This class is for pet cats.
 *
 * @author Linda Fernsel
 * @version 1.0.0
 */
public class Cat extends Carnivore implements Pet
{
    String name; 
    /**
     * Constructor for objects of class Cat
     */
    public Cat(String name)
    {
        this.name = name;
    }
    
    // The Cat class can override methods from its parent or not
    public void eat(String food) {
        if(food.equals("meat") || food.equals("fish")) {
            System.out.println("Thank you, I love " + food);
        } else {
            System.out.println("Now that I think of it, I am not really hungry.");
        }
    }
    
    // The Cat class needs to implement the methods from the interface
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void sayName() {
        System.out.println("Meow, I am " + this.name);
    }
}
