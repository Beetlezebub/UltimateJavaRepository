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
