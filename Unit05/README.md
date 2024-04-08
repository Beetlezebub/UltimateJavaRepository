# Unit 05 - Writing Classes

## 5.1 - Anatomy of a Class
Keyword `private` restricts access of classes, data, etc. to the class we're in, while keyword `public` give access to classes outside the declaring class

Ex:
    Class -- Snack
    Attributes: name; calories
    Behaviors: get name/calories; set name/calories


`public` access modifiers
    - no restriction on access
    - other classes can access
Classes and constructors always public for AP CS-A

`private` access modifiers
    - restrictions on access
    - only access in given class
Instances always private for AP CS-A

Methods can be public or private
    - beware of accessability
    - an object can call on public methods in any class
    -private methods only called on in own class


Data encapsulation is a technique in which the implementation or details of the class are kept hidden from the user
Do this with instance variable by using the private access modifier
Use accessor and mutator methods as public methods to allow client code to use and modify the data

Give all instance variables a privvate visiability designation. Why? Part of what we call encapsulation

### Encapsulation
- a fundamental concept of object-oriented programming
- Wrap the data (variable) and cod that acts on the data (methods) in one unit (class)
- In Ap CS-A this is done by:
    - Writing a class
    - Declaring the instance variable as private
    - Providing accessor (get) methods and modifier (set) methods to view and modify variables outside of the class

### Why make the instance variables private?
- Restrict access (read-only)
- Option to provide validation checks

## 5.2 - Constructors
Define instance variables for the attributes to be initialized throught the constructors of the class.
An object's state refers to its attributes and their values at a given tine and is defined by instance variable belonging to the object. This creates a "has-a" relationship between the object and its instance variables; constructors set intial state of the object.

Each instance of a class (object) "has-a" private instance variable.
Ex: 
    Each instance of `Snack` "has-a" name and # of calories


Constructor parameters are local variables to the constructor and provide data to initialize instance variables
State of the instance variables can be updated by methods in the class.

The constructor that is used to set the state depends on the way the object is instantinated
Only one constructor will be used to set the state of the instance variables

What if not all instance variables are set through parameters? Even if your constructor only needs 1 variable, the constructor still has to set that value, so it needs to be provided a default value

If no constructor provided, Jav provides a default value
(like intializing an int instance variable but having no constructor assigning it a value, it'll automatically be set to 0)

## 5.3 - Documentation with Comments
Just for making code more readable and prevent execution when testing alternative code
Helpful in reading FRQs

Documentation comments pull out all their comments to make documentation of the class in form of a webpage.


A postcondition is a condition that must always be true after the execution of a section of program code. Postconditions decribe the outcome of the execution in terms of what is being returned or the state of an object

## 5.4 - Accessor Methods
Accessor methods allow other objects to obtain the value of instance variables or `static` variables
A non-void method returns a single value. Its header includes the `return` type in place of the keyword `void`

### Accessor Methods
Allows safe access to instance variables
Referred to as "get methods" or "getters" or something along those lines
Whenever there is need for a different class to access the instance variables, accessor methods are necessary

### Visibility, Return Type, and Signature
Must be public
Return type must match the type of instance variable to be accessed
Name is often get[NameOfVariable]
No parameters


The `toString` method is an overridden method that is included in classes to provide a description of a specific object. It generally includes what values are stored in the instance data of the object.

### `toString` Method
- Returns a string with information about the instance variables
- has to look like this: `public String toString()`
    - Always returns a string
    - No parameters
- When SYstem.out.println(object) is called on an object
    - the `toString` method is called
    - the returned string is printed

## 5.5 - Mutator Methods
A void method does not return a value and its header contains the keyword `void` before the method name
A mutator (modifier) method is often a void method that changes the values of nstance variables or static variables

### Mutator Methods
- Allows the change of values for instance variables ouside the class
- Often referred to as "set methods" or "setters"
- If there is any need for a different class to modify the instance variables, mutator methods are necessary

### Visibility, Return Type, and Signature
- Must be public
- Return type should be void
- Name often set[NameOfVariable]
- Parameter type must match the type of the instance variable to be modified

## 5.6 - Writing Methods
Methods can only access the private data and methods of a parameter that is a reference to an object when the parameter is the same type as the method's enclosing class
Non-void methods with parameter recieve, use those vales, and return a computed value of the specified type

## 5.7 - Static Variables and Methods
You can define behaviors of a class through static methods
Static methods can't access or change the values of instance variables
Static methods can access or change the values of static variables
Static methods don't have a `this` reference and are unable to use the class's instance variables or call non-static methods

Static or non-static is decided by what data the method needs access to
    If it needs access to any of the instance data, it needs to be non-static
    If it only needs access to the static data, then its static


Static variables belong to the class, with all objects of a class sharing a single static variable
Static variables can be designated as either public or private and are designated with the static keyword
Static variables are used with the class name and the dot operator, since they are associated with the class, not objects of a class

## 5.8 - Scope and Access
You can declare local variables in the body of constructors and methods which may be used within the constructor ot method and can't be declared to be public or private
When there is a local variable with the same name as an instance variable, the variable name will refer to the local variable instead of the instance
Through method decompisition, a programmer breaks down a large problem into smaller subproblems by creating methods to solve each individual subproblem

## 5.9 - `this` Keyword
Within a non-static method or constructor, the keyword `this` is a reference to the current object -- the object whose method or constructor is being called
The keyword `this` cane be used to pass the current object as an actual parameter in a method call

(on local vs instance slide `this.` is needed and used to clarify it's referring to the local variable not the instance variable)

## 5.10 - Ethical and Social Implications of Computing Systems
### Computer Ethics
- Topic not tested on AP Exam, yet is one of the most important topics to consider in our use of computers
- Golden Rule
- When you're a computer scientist in a professional capacity there professional organizations you're expected to join; here's 3 hi-lighted:
    - Computer Professionals for Social Responsibility
        - https://www.cpsr.org/issues/ethics/cei
    - Association for Computing Machinery
        - https://ethics.amc.org/code-of-ethics/
    - Institute of Electrical and Electronics Engineers
        - https://www.ieee.org/about/corporate/governance/p7-8.html

### Copyright