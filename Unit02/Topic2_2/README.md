# 2.2 Creating and Storing Objects (Instantiation)
## Creating Objects
Use constructors to initialize attributes in objects
    `public Person(String nm, int ag, boolean ad)`
        `name = nm;`
        `age = ag;`
        `isAdult = ad;`

Signature is the name of the object and the paremeters, always starts with public (it's the first line at the start of the code)
Call by value is the object you're actually passing when you call to the constructor when you actually make the object

An object is created by using a new keyword
    `Dog graceDog =` **new** `Dog("Grace", "lab", 1);`

Creates a new object and calls the constructor

### Overloading Constructor
Overloading a constructor isa when you have more than one constructor for an object.
A **no-argument conwstructor** has no parameters and sets the instance variables for objects to their default values


## Creating an Employee
Ex: 
    `Employee personl = new Employee ("Simon", "7628", 60000)`
"=" is the operator, "new" is the new keyword, the first "Employee" is the variable type, and the second is the constructor, and finally, "('Simon', '7628', 60000)" are the parameters actually being passed