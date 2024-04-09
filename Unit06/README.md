# Unit 6 - Array

## 6.1 - Array Creation and Access
### Array vocabulary
- An array is a data structure used to implement a collection (list) of primitive or object reference data
- An element is a single value in an array
- The index of an element is the position of the element in the array
- Length is a public final data member of an array
- The last element of an array named `list` is at indexlist.lenth -1

`int [] listOne = new int[5]3` -- makes a new list, 5 elements long, all elements set to 0
`listOne[2] = 33` -- sets the element at index 2 to equal 33
`listOne[3] = listOne[2] * 3` -- sets the element at index 3 to equal the element at index 2 * 3
`listOne[5] = 13` -- would cause an ArrayIndexOutOfBoundsException because there in no index 5 to access
`System.out.println(listOne)` -- would just print the hashcode of the list not the items
`System.out.println(listOne[4])` -- prints the element at index 4

### Using intializer lists
- Element of type int are initialized to 0
- Elements of a reference type (including String) are intialized to the reference value null
- Elements of a type double are initialized to 0.0
- Elements of type boolean are initialized to false
When we know the values for the array at the time of creation, an intializer list can be helpful
    `double [] grades = {70.5, 88.2, 93.7, 98.7}`

## 6.2 - Traversing Arrays
Iteration statements can be used to access all the elements in an array (traversing an array)
Traversing an array with an indexed for loop or while loop require elements to be accessed using their indicies
Sonce the indicies for an array start at 0 and end at the number of elements -- 1, "off by one" errors are easy to make when traversing an array, resulting in an ArrrayIndexOutOfBoundsException being thrown

### Traversing with a for loop
Traversing an array means to access ***each*** element of an array
Since an array is indexed from 0 to -1, standard for loops make is very convenient and easy to traverse arrays

A for loop can also be used to access only some of the elements in an array so check the loop variable intialization, condition and increment

Do <= can lead to an out of bounds error since, for example, it would include 5 when the listlength is 5, but there is no actual index 5

## 6.3 - Enhanced for Loop for Arrays
The enhanced for loop is also called a for-each loop

## 6.4 - Developing Algorithms Using Arrays
To find the minimum or maximum value of an array we need a method that can take a parameter of an array of primitive values (int or double) and return the item at the appropriate extreme
Inside the method, a local variable is needed to store the current max or min value to compare against.
Youy can either use a standard for loop or an enhanced for loop to determine the max or min.
Inside the for loop, compare the current value against the local variable and assign it to the temporary variable.


In order to calculate the average  of objects in arrays, we need a method that can take a parameter of an array of Objects and calculate and return the average value.
Inside the method, a local double variable is needed to store the accumulated values. Then we use a for loop to traverse the array and add the current total to the variable, and then divide by the number of items stored.


To shift the contents of an array to the right, we need to know how much we're shifting by, and it'll need to be an int.
In order to move the contents  we need to make an empty array of the same size and then iterate over the original array and properly copy the values to the adjusted index in the new array.
Then we need to assign the new array back to the original variable.
We must use a standard for loop, not an enhanced for loop since this algorithm is dependent on the index of each value in the array.

To shift to te left, we use nested for loops. The outer loop will execute the numbe of of times we are shifting. The inner loop will first copy the value stored in the first index, then move all contents one spot left. Finally, copy the temp variable back to the end of the array.
Also have to use a standard for loop for the same reasons.