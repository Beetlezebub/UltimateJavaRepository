# Unit 8 - 2D Array

## 8.1 - 2D Array
2d array is an array of arrays
2d layouts can be better way to store data

### Declaring a 2d Array
`DataType[][]   nameOf2DArray`

### Initializing a 2d Array
`new DataType [r][c]`
Need to know the # of rows (number of arrays of arrays (r))
Need to know # of columns (length of each array row (c))

Can intialize 2d arrays with intializer lists using curly braces
Each row of a 2d array needs it's own intializer list (aka it's own brackets) and seperate arrays with commas
Ex:
    {{"Alice", "Rob", "Cody"}, {"Robin", "Becky", "Kisha"}}

Put all together
Ex:
    int[][] a = new int[10][20];

### Size of 2d Array
Refers to 2d Arrays' size by the # number of rows and # of columns, so you multiply them by each other
To find the # of rows, you just call .lenth for the 2d array. The # of columns of a 2d array is based on the size of each row array. In the course, each row array in a 2d array has the same # of elements. So all you have to do is find the # of elements in the first row array.


### Accessing elements of 2d arrays
Like a 1d array you can access an array element using bracket notation and the index of the element's location in both dimensions
Ex:
    grades[5][2]
5 for row 5, 2 for column 2
Row is always before column

### Updating elements of 2d Arrays
Want to change the grade in row 5, column 2 to 100
Ex:
    grades[5][2] = 100
    grades[5][2] = grades[5][2] + 1


In the frst example in video 3, only option 2 would work to change Australia to Athens

## 8.2 - Transversing 2D Arrays
Nested iteration statements are used to traverse and access allelements in a 2d array. Since 2d arrays are stored as arrays of arrays, the way 2d arrays are traversed using for loops and enhanced for loops is similar to 1d arrays.
The outer loop of a nested enhanced for loop used to traverse a 2d array traverses the rows. Therefore, the enhanced for loop variable must be the type of each row, which is a 1d array. The inner loop traverses a single row. Therefore the inner enhanced for loop variable must be the same type as the elements stored in the 1d array.

When you don't know the dimensions of a 2d array, you use `row < grid.length` for the outer loop's conditional, and `col < grid[0].length` for the inner loop conditional (obviously substituting the 2d array name (and the variable name if wanted)). This is because the number of rows is just the number of arrays in the 2d array, and the number of columns is just the number of elements in each array (which is always the same in this course).

### Enhanced for loops
You'd need each "String[] (variable name)" (or whatever kind of array it is) within "grid" (or whatever the 2d array is called). Then you can do "for (String letter: row)" for each element in each individual array (or whatever data type it is).


Nested iteration statements can be used to traverse the 2d array in "row-major order" or "column major order"

Row-major order is just what we did in the last video, printing each element in an array before doing the next
Column-major order is printing each element in a column then moving on to the next

To do column-major order, just switch the inner and outer loop from the row-major order
Because you're not grabbing the row array you can't really use enhanced for loops


When applying sequential/linear search algorithms to 2d arrays, each row must be accessed and then sequential/linear search applied to each row of a 2d array
