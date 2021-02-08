
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


        polymorphismExamples();

        Riddle r = new Riddle();
        r.runRiddle();


    }


    public static void polymorphismExamples(){

        Carnivore carnivore = new Carnivore();
        Cat cat = new Cat("Kitty");

        // ### Method overriding
        System.out.println("Method overriding, carnivore then cat speak");
        carnivore.speak();
        cat.speak();

        // ### Method overloading
        System.out.println("Method overloading, cat purrrs twice");
        cat.speak(2);
        // Output: "purr purr"


        // Objects of child class being used as objects of parent class
        System.out.println("object referencing, array of type carnivore speak, among them purr");
        Carnivore [] hunters = new Carnivore[] {carnivore,cat};
        for (Carnivore hunter : hunters){
            hunter.speak();
        }
        // Output: "Rawr"
        // Output: "Purr"


        // Objects of child type being referenced as objects of parent type
        System.out.println("Variable of Parent type references a child instantiation, c is perceived as a cat and purrs");
        Carnivore c = new Cat("Cat");
        c.speak();
        // Output: "rawr"
        // can not however execute c.speak(2);
    }
}
