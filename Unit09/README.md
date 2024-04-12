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
Already know most of this in the first video because we basically already covered it in in the other units

`super.[MethodName]` lets you call a method from the parent class
When calling a super class method you've done an override on, super doesn't need to be the first line of the method's code

## 9.5 - Creating References Using Inheritance Hierarchies
If S is a subclass of T, then assigning an object of type S to a reference of type T facilitates polymorphism
If S is a subclass of T, then a reference of type T can be used to refer to an object of type T or S
Declaring references of type T when S is a subclass of T is useful in the following declarations:
    - Formal method parameters
    - arrays -- `T[] var` or `ArrayList<T> var`

Can create a variable and have it refer to an object of a subclass extending from it (has to have the parent class on the left and the subclass on the right)

### Power 
Why declare a variable using a superclass if we plan to store a reference to a subclass object?
    - A collection (array or ArrayList) needs to be declared as a datatype
    - We store **all** of our writng utensils in our pencil case
        Ex:
            `WritingUtensil[] pencilCase = new WritingUtensil[3];`
            `pencilCase [0] = new Pen();`
            `pencilCase[1] = new GelPen();`
            `pencilCase[2] = new Marker();`
    - This in turn, supports polymorphism. Each writing utensil likely displays writing differently. Let's say the behavior is implemented through a method `public void write(String text)` in the WritingUtensil Class, which is overridden appropriately in each subclass.
        Ex:
            `for(WritingUtensil wu : PencilCase){`
            `    wu.write("Hello.");`
            `}`
        Asks each individual object to write hello

## 9.6 - Polymorphism
When calling methods in an inheritance relationship, you can utilize the Onbject class through inheritance
At compile time, methods in or inherited by the declared type determine the correctness of non-static method call
At run time, the method in the actual type is executed for a non-static method call

- A reference variable is polymorphic when it can refer to objects from different classes at different points in code
    - A reference variable cna store a reference to its declared class or to any subclass of its declared class'
- A method is considered polymorphic when it is overridden in at least one subclass
- Polymorphism is the act of executing an overridden non-static method from the correct class at runtime based on the actual object type
[come back and dictate from notebook]




## 9.7 - Object Superclass
