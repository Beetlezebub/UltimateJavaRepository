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


For-each loop, by design, iterates from first to last order and will visit each element of the ArrayList
Indexes are not explicitly used and copies of the current element are made at each iteration

## 7.4 - Developing Algorithms Using `ArrayList`s
Notes basically just on the coding file

## 7.5 - Searching
The process of searching incorporates control structures we've used before: iteration and selection aka a loop with an if inside

Linear searching fits a standard for loop. We need to specify each element one at a time, and do not need to track the index after execution.
Inside the for loop we retrieve the value from the structure at the specified index and compare it to the searched value. If it matches we return the index, if not we keep looking.


### Searching Linear Structures
Linear search algorithms are BEST used when we don't have any idea about the order of the data and so we need to look at each element to determine if what we are looking for is in fact inside the array or ArrayList
When searching, we need to remember that different data types require different comparisons.
- When looking at **int** values, the == operator is the tool to use
- When searching for a **double** value, we need to make sure the value is close enough by doing some math
- **Object** instances should always use the `.equals(otherThing)` method to check for a match

When searching a linear structure we need to send it the structure and what we're looking for as parameters
Usually the search method will return the index of the found item, or -1 if it's not found. We can also simply return a boolean value if the desired item is located anywhere inside the structure.
A standard for loop with an if block is all we need to search any linear structure. If the item mathes the conditions, it should return the index immediately so we don't need to continue executing the method. If the value is not found after completing the loop it can return -1 indicating there is no index with th desired value.


### Why does order sometimes matter
When searching for a value 

to remove from a list, if we search forward we have to make sure to adjust the loop control variable, or we might skip what we're looking for when removing
- Starting from the back of the list is best because if you go from the front and remove something, it may skip automatically skip the next value since the next value would shift to the value you just removed, even if you need to remove that value.
- Starting from the back makes it so a value you already checked moves to the place of the item you just removed, making sure you don't skip anything

### Can we use an enhanced for loop to search?
Yes. As long as we're only checking for existence a for-each loop will work fine since they don't track the index or position in the structure.

### Removal
What logically needs to be done if removing in a forward loop?
Inside the block, but after removing the value at the index set the loop control vatiable to be itself minus 1

## 7.6 - Sorting
### Selection Sort
One of easiest sorts to demonstrate. It identifies either the min or max of the compared values and iterates over the structure checking if the item stored at the index matches that condition. If so, it will swap the value stored at that index and continue. The implemnetation uses a helper method to perform the swap operation since variables can only hold one variable at a time.

Can't used an enhanced for loop for this because the selction sort algorithm needs to know the index of the items it's working with
How does the swap occur? A 3rd variable is needed to temporarily hold on to the swapped value from the array since variable can only hold one thing at a time

## 7.7 - Ethical Issues Around Data Collection
