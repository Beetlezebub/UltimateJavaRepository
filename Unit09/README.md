# Unit 9 - Inheritance

## 9.1 - Creating Superclasses and Subclasses
A class hierarchy can be developed by putting common attricutes and behaviors of related classes into a single class called a superclass
Classes that extend a superclass, called subclasses, can draw upon the existing attributes and behaviors of the superclass without repeating these in the code
Extending the subclass from a superclass creates an "is-a" relationship from the subclass to the superclass

### What is Inheritance
In Java, inheritance is used to build a hierarchy of classes that have similar characteristics (similar to "taxonomic classification")
Parent classes (superclasses) have attributes and behaviors that can be inherited by child classes (subclasses)

### Why do we use Inheritance in Java?
- Code Reusability
    Higher-level classes can be used over and over again
- Prevents repeating code
    Common methods and variables are now in one location
- Readability and organization
    Having a solid, organized structure of your classes and objects allows for greater readability and cohesion
- Ease of maintenance
    Changing a general behavior in one place rather than many saves time and effort

You know which way the arrows flow by using "is-a"
Ex:
    A Musician is a Performer [✓]
    A Comedian is a Performer [✓]
    A Performer is a Musician [X]


The keyword "extends" is used to establish an inheritance relationship between a subclass and a superclass. A class can only extend on superclass

## 9.2 - Writing Constructors for Subclasses
Constructors are not inherited
When a subclasses' constructor doesn't explicitly call a superclasses constructor using `super`, Java inserts a call to the superclass's no-argument constructor

### What actually happens?
Ex: 
    Musician branford = new Musician("Saxophone");
Immediately goes to performer class, it's parent class, and sets name and age to the default constructor of "The Performer" and "16", then goes down and sets instrument to saxophone, an dthen inherits all the different methods of the 2 classes
By default, the no-argument constructor is called

## 9.3 - Overriding Methods

## 9.4 - super Keyword

## 9.5 - Creating References Using Inheritance Hierarchies

## 9.6 - Polymorphism

## 9.7 - Object Superclass
