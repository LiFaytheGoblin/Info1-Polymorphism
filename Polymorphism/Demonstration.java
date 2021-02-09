
/**
 * This class demonstrates some of the features of this project: objects, classes, inheritance and interfaces
 *
 * @author Konrad
 * @version 1.0.0
 */
public class Demonstration
{
    public static void main(String args[]) {
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

      // ### Dynamic Loading
      // Objects of child class being used as objects of parent class
      System.out.println("object referencing, array of type carnivore speak, among them purr");
      Carnivore [] hunters = new Carnivore[] { carnivore, cat };
      for (Carnivore hunter : hunters){
          hunter.speak();
      }
      // Output: "Rawr"
      // Output: "Purr"

      // Objects of child type being referenced as objects of parent type
      System.out.println("Variable of Parent type references a child instantiation, c is perceived as a cat and purrs");
      Carnivore otherCat = new Cat("Cat");
      otherCat.speak(); // Outputs "rawr"

      // Try uncommenting the next line. What happens? Why?
      // c.speak(2);
    }
}
