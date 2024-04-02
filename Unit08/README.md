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
