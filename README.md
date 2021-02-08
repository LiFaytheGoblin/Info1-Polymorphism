# A Unit on Polymorphism

This page helps you to follow the unit on Polymorphism. It is a synchronous e-learning unit, but you can come here to read on what to do in the exercises or to do the unit asynchronousely on your own. If you do the e-learning unit synchronousely, you have the advantages of being able to work with your commilitones, to ask questions and get immediate answers and to participate in the plenum discussions of the exercise solutions, to get immediate feedback on your understanding.

## 1. Warm Up (15 Min)

Download the sample code of the folder [https://github.com/LiFaytheGoblin/Info1-Polymorphism/tree/main/ObjectsClassesInheritanceInterfaces](ObjectsClassesInheritanceInterfaces) and open it in BlueJ.

Answer the following questions:
* Give examples to explain the difference between a class and an object.
* Give examples for an inheritance hierarchy in real life.
* How is implementing an interface different from inheriting from a class?

 Explore the code and if needed adjust your understanding of classes, objects, inheritance and interfaces.

## 2. Introduction (30 Min)

### I. Definition of Polymorphism and Origin

Answer the following question:
* Have you heard about Polymorphism? What might it refer to?

Read the following definitions for Polymorphism:
* "Polymorphism, in biology, a discontinuous genetic variation resulting in the occurrence of several different forms or types of individuals among the members of a single species." (Source: [https://www.britannica.com/science/polymorphism-biology](Britannica))
* "Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways." (Source: [https://www.w3schools.com/java/java_polymorphism.asp](W3Schools))

Answer the following question:
* Name real world analogies for Polymorphism.

### II. Concepts and Examples

Download the sample code of the folder [https://github.com/LiFaytheGoblin/Info1-Polymorphism/tree/main/ObjectsClassesInheritanceInterfaces] and open it in BlueJ.

Look at the following method of the Carnivore class:
```
public void speak (int howOften){
    for(int i = 0; i < howOften; i++) {
        System.out.println("hello");
    }
}
```

Look at the following two methods of the Cat class, that inherits from Carnivore:
```
public void speak (int nrPurrs){
    for(int i = 0; i < nrPurrs; i++) {
        System.out.println("purr");
    }
}

public void speak (String sound, int nrPurrs){
    for(int i = 0; i < nrPurrs; i++) {
        System.out.println(sound);
    }
}
```

Look at the following code in the main()-method: 
```
Carnivore carnivore = new Carnivore();
Cat cat = new Cat();

Carnivore[] hunters = new Carnivore[] { carnivore, cat };

for (Carnivore hunter : hunters){ 
    hunter.speak(); 
}

// ...

Carnivore otherCat = new Cat();
otherCat.speak();
```

Answer the following questions (you can put the code above into the sample code to see whether you guessed correctly):
* How do the two methods in the Cat class differ from each other?
* What happens if I call `carnivore.speak(2);` on an object of type Carnivore?
* What happens if I call `cat.speak(2);` on an object of type Cat?
* What happens if I call `cat.speak('meow', 2);` on an object of type Cat?
* What happens if I call the `main()`-method?
* What do you think, why can I put objects of type Carnivore and Cat into the hunters array in the `main()`-method?

Think about the following explanations:
* When Cat implements a method with the same signature as the parent class, that is called **method overriding**.
* When Cat implements different methods with almost the same signature but different parameters, that is called **method overloading**.
* Objects of a child class may be used the same way an object of the parent class is used. In this example, both `carnivore` and `cat` are treated as objects of type Carnivore by being added to the array of type Carnivore (`hunters`), but the method `speak()` is being called from the type of the object of `cat`, Cat. When it is only decided at run time which method exactly is called (of class Carnivore or Cat), that principle is called **dynamic binding**.

## 3. In-depth Practise

### I. Riddle (20 Min)

Download the sample code of the folder [https://github.com/LiFaytheGoblin/Info1-Polymorphism/blob/main/ObjectsClassesInheritanceInterfaces/Riddle.java] and open it in BlueJ. Do not run the program yet. 

Answer the following question:
* What will be printed after each of the printing commands and why?

Run the code to see whether you were right.

### II. Design (20 Min)

Download the UML class diagram [https://github.com/LiFaytheGoblin/Info1-Polymorphism/blob/main/Exercise2ClassDiagram.png](https://github.com/LiFaytheGoblin/Info1-Polymorphism/blob/main/Exercise2ClassDiagram.png) and either upload it into a miro board for collaborative editing or put it into an image editing software of your choice. This diagram represents the relationship between different types of cups and liquids.

Answer the following questions:
* Take the following elements: Glass Cup, Tumbler, Liquid, Water, Coffee, Soy Milk. If those were classes, what relationships would they have with each other?
* Add the elements as classes to the given UML.
* After adding the classes to the UML, describe where polymorphism is made use of.

## Wrap Up (5 Min)

Reflect on the following questions:
* "What do you now know about polymorphism?"
* "When is polymorphism useful?"

## Graded Homework (60 Min)

Create a cheat sheet containing at the minimum the definitions of polymorph variables, dynamic binding, method overriding and method overloading and a code example for each definition. You can come up with your own scenario for these examples or make one around the theme of ball sports games. You are not allowed to use one of the scenarios covered in this unit. To see whether your code examples work the way you expect it makes sense to test them!

Hand in:
* The cheat sheet
* Any questions that might have come up

You will be graded with a maximum of 4 stars and be given a feedback. If your cheat sheet is especially good, it will be uploaded into the honorable gallery of great cheat sheets, and you get an extra star for it.

