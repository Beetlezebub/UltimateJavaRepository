# Unit 10 - Recursion

## 10.1 - Recursion
A recursive method is a method that calls itself
Ex:
    public static void example(int n){
        in (n > 0){
            eample(n - 1);
        }
    }
Recursive methods contain at least one base case (halts the recursion; needs a conditional to do this) and at least on recursive call
Each recursive call has it's own set of local variables, including the formal parameters
Parameter values cpture the progress of a recursive process, much like loop control variable values capture the progress of a loop
Any recursive solution can be replicated through the use of an iterative approach
    - Exclusion Statement: Writing recursive program code is outside the scope of the course and the AP Exam


Recursion can be used to traverse String, array, and ArrayList objects

An organized tracing chart can help trace recursions when they become more complicated

## 10.2 - Recursive Searching and Sorting
Data must be sorted to use binary search algorithm
The binary search algorithm starts at the middle of a sorted array or ArrayList and eliminates half of the array or ArrayList in each iteration until the desired value is found or all elements have been eliminated
Binary search can be more efficent than sequential/linear search
The binary search algorithm can be written either iterativeky or recursively

pass in low and high index to set the boundaries for what we're searching for then use low position compared to high position in order to find mid position
then compare midposition to target and either adjust low position up or high position down

No loops, only recursive calls
Data has to be in sorted order to work properly


Merge sort is a recursive sorting algorithm that can be used to sort elements in an array or ArrayList

Start at left side of list, sort them in order, then go to rightand do the same, then merge them back together and do a final sort for that piece


In the example, we have the Array: {3, 4, 6, 8, 1, 2, 5, 7}, ready to be sorted and merged

### ***This is not the Definitive way to do this, just the one they teach.They are still other ways that work.***
- First thing you should do on the last merge step is copy all the original elements to a temporary array
//think of the temporary array as 2 virtual arrays, work from left to right in each array, compare elements to retun them to the original
- Need a variable to keep track of the index on the left half, a variable to keep track of the index on the right half, and a variable to keep track of the index of the target
- First gunna compare the first elements at the index of left and right pointer (the 2 variables fot the halves at the 0 position)
    - 1 is less than 3 in this example, so we move that one back first
- then increment the right side and target tracker variable by one, but not the left side
- then compare the elements at the 0 position on the left side and the 1 position on the right
    - a 3 and 2 in this case, and 2 is less than 3 so 2 is added first, and the right and tracker are incremented again
- then continue on, incrementing the lists that are added until all the elements are added
- after the second to last element it's a bit different
    - It's not techniclly a loop, and there's only 2 things that would stop it: the left pointer increments to the right half, or the
    - We technically can't do another comprison because 7 was the last element on the right half of the array, and another comparison would make it increment again, sending it out of bounds
        - You gotta have something to stop it if the pointer hits the length of the array because we still have another element to add
    - Need an extra piece that says if any elements remain in the lower half of the temporary array, return them to the array in order
    - Each half is already sorted, so all we have to do is take them one at a time and add them on to the array
- Finally sorted everything and merged them together