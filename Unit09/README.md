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


The actual parameters passed in the call to the superclass constructor provide values that the constructor can use to initialize the object's instance variables
When a subclass's constructor doesn't explicitly call a superclass's constructor using `super`, Java inserts a call to the superclass's no-argument constructor
Regardless of whether the superclass constructor is called implicitly of explicitly, the process of calling superclass constructors continues until th object constructor is called. At this point, all of the constructors within the hierarchy execute beginning with the object constructor.

### Calling Superclass Constructors
[just stuff we know about java doing it automatically]
- If you do include a call to `super()` in your constructor, it must be the first line of the body of the constructor
- Process of calling superclass constructors continues up the inheritance hierarchy in order until the Object constructor is called

To add parameters when calling super, you would put it in the empty parenthesis
Ex:
    super(n, a)
Would still need to make a method that takes 3 arguments

## 9.3 - Overriding Methods
Method overriding occurs when a public method in a subclass has the same method signature as a public method in the superclass
Any method that is called must be defined within its own class or its superclass
A subclass is usually designed to have modified (overridden) or additional methods or instance variables
A subclass will inherit all public methods from the superclass; these methods remaing public in the subclass

### Inheritance and Methods
What are our options when we extend a superclass?
- **Inherit Methods:** Any public methods in the superclass become valid public methods of the subclass. These are especially important to access private instance variables of the superclass.
- **Write New Methods:** The subclass can have additional methods that are completely independent of methods in the superclass. This includes methods that are overloaded (same method name, different signatures) and treated as independent methods.
- **Override Methods:** Write a new and different implementation of a method that already exists in the superclass.

### A Comedian `is a` Performer: Using `extends`
Comedian would inheritthe public methods `getName()`, `practice()`, and `perform()`

## 9.4 - super Keyword

## 9.5 - Creating References Using Inheritance Hierarchies

## 9.6 - Polymorphism

## 9.7 - Object Superclass
