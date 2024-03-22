# Unit 7 - `ArrayList`

## 7.1 - Introduction to `ArrayList`
Various way to represent collections of object reference data is best used on ArrayLists of objects
An ArrayList is mutable and contains object references

Arrays are static, once initialized their size can't be changed
ArrayLists are dynamic in their size, so it can be changed at any time

### Differences between Array and ArrayList
**Array**                       **ArrayList**
- Fixed length                  - Resizable length
- Fundamental Java feature      - Part of a Framework
- An object with no methods     - A Class with many methods
- Not as flexible               - Is designed to be flexible
- Can store primitive data      - Not designed to store primitives
                                - is slightly slower than Arrays
                                - Can only be used with an import statement

The ArrayList class is implemented using Arrays


An `ArrayList()` constructs an empty list
Java allows the generic `ArrayList<E>`, where E specifies the type of the elements
When `ArrayList<E>` is specified, the types of the reference parameters and return type when using methods are type E
The ArrayList class is part of the java.util package

To import you use `import java.util.ArrayList;` or `import java.util.List;`

### ***Declare a Variable to Reference an ArrayList Object***
`ArrayList<DataType> variableName;`
`List<Datatype> variableName;`

### Insatiate an ArrayList Object
Stores only elements of the same, nonprimitive data type  (data type can't be primitive)
EX:
    new ArrayList<DataType>();
    new List<DataType>(n);
"n" represents the number of elements initially

### Primitive Values Disguised as Wrapper Class Objects
ArrayList objects are designed to only store references to objects, not primitive values. A workaround is to use Wrapper classes which store primitve values as objects.
**Primitive Data Types**     **Wrapper Class Data Types**
boolean                      Boolean
char                         Character
double                       Double
int                          Integer

## 7.2 - `ArrayList` Methods
- `int .size()` -- Returns the number of elements in the list
- `boolean .add(E obj)` -- Appends obj to the end of list; returns true
- `void .add(int index, E obj)` -- Inserts `obj` at position `index` (0 <= index <= size), moving elements at position `index` and higher to the right (adds 1 to their indicies) and adds 1 to size
- `E .get(int index)` -- Returns the element at position `index` in the list
- `E .set(int index, E obj)` -- Replaces the element at position `index` with `obj`; returns the element formerly at position `index`
- `E .remove(int index)` -- Removes element from position index, moving elements at position `index + 1` and higher to the left (subtracts 1 from their indicies) and subtracts 1 from size; returns the element formerly at position `index`

To add objects to an ArrayList, the objects must be the same data type used to instantiate the ArrayList


### Passing an ArrayList as a Method Parameter
ArrayList is a reference object when passed as a parameter in a method, they are passed as references to their addresses, not copies of their value
When a method updates elements of a passed ArrayList, its elements are updated automatically

In the 2nd example in video 2, even though the main method is passing a Boolean ArrayList, the complier warns that myMethod1 might not be safe. To prevent these issues, specify the data type of elements stored in ArrayList
In the 3rd example, is specifies the ArrayList data type in the header, and the code gives a much more detailed explanation of the problem and why it won't work
When you specify the data type of the elements stored in the ArrayList, the compiler is more helpful in describing the errors.

### Returning an ArrayList from a Method
In order to return an Arraylist, it is preferred that you specify the data type of the elements that the ArrayList stores


h

## 7.3 - Traversing `ArrayList`s
Iteration Statments can be used to access all the elements in an ArrayList (same as with Arrays)
Deleting elements during traversal of an ArrayList requires using special techniques to avoid skipping elements (also considered traversing an ArrayList)


h

## 7.4 - Developing Algorithms Using `ArrayList`s
Notes basically just on the coding file

## 7.5 - Searching

## 7.6 - Sorting

## 7.7 - Ethical Issues Around Data Collection
