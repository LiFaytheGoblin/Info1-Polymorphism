
/**
 * This class demonstrates some of the features of this project: objects, classes, inheritance and interfaces
 *
 * @author Linda Fernsel
 * @version 1.0.0
 */
public class Demonstration
{
    public static void main(String args[]) {
        // ###Difference between a class and an object
        
        Carnivore carnivore = new Carnivore(); // create an instance of class Carnivore
        carnivore.eat("vegetables");
        carnivore.eat("meat");
        
        Carnivore otherCarnivore = new Carnivore(); // create another instance of class Carnivore
        carnivore.eat("meat"); // it does the same as our previous carnivore
        
        System.out.println("Both carnivores eat the same, \n but are those Carnivores identical? " 
        + carnivore.equals(otherCarnivore));
        
        
        // ### Inheritance
        
        carnivore.eat("fish"); //carnivores don't necessarily like fish...
        
        Cat cat = new Cat("Polly");
        cat.eat("fish"); //but cats do!
        
        
        // ### Interfaces
        
        cat.sayName();
        
        Stone stone = new Stone("Stella");
        stone.sayName(); //Stone also implements the sayName method!
    }
}
