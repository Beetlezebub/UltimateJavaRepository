# Unit 4 - Iteration

## 4.1 - `while` Loops
A loop is just a repetition of statements

    while (/* Boolean expression */ )
    {
        // statement 1;
        // statement 2;
        // etc...
    }

A loop control variable is what is checked for the while loop and controls whether the loop is activated or not. It's initiated before the loop and usually updated at the end of the loop soit's not going on forever.

The first example would print from 2 to 64 because it can't multiply by 2 anymore without exceeding 100
the second example would need to be `while ( number >= 0)` and then in the while loop have `number -= 4`


An infinte loop is a loop that never evaluates to false, and a loop that immediately evaluates to false is never executed.


### Sum the individual digits of an integer
Given a multidigit integer, sum the individual digits
    5384 --> 5 + 3 + 8 + 4 = 20

What tools in Java do we have to complete the task?
Mod (%) -- (Any Integer) % 10 --> last digit
Integer Division -- (Any Integer)/10 --> eliminates last digit
`while` loop -- Allows us to repeat a task multiple times

What is the algorithm?
While there are digits left in the number
    -Given an integer called number
    -Create variable for the sum
    -Use mod(%10) to isolate the last digit of out number
    -Add the last digit tot he sum
    -Use integer division (/10) to eliminate the last digit from our number
- Then display final sum when there's no more digits left

## 4.2 - `for` Loops

## 4.3 - Developing Algorithms Using Strings

## 4.4 - Nested Iteration

## 4.5 - Informal Code Analysis
