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
the initialization of for loops only happens once before the 1st boolean expression evaluation 

### Structure
    for (initialization; oolean expression; update; )
        //statement one;
        //statement two;
        //etc.;
Very similar to while loop

The first example will display "2 5 8 11 14 17 20"
The second example will print out 55 because it's adding the number i is -- which increases by 1 each time -- which would add up to 55


a `for` loop can be rewritten into an equivalent `while` lopp, and vice versa; they have similar and/or interchangable parts

### for Loops vs. while Loops
Which is better? No one right answer
- When statements repear a defined number of times, a for loop may be more appropriate; start and end values can be seen on same line
- When repeating statements an unknown number of times or based on a complex Boolean expression, a while loop may be more appropriate, because the while statement isolates the Boolean expression
- If the update to the loop control variable is more complex than a simple increment or decrement (such as complex calculation or series of method calls), then a while loop may be more appropriate, because you can update the loop control variable over a series of statements to make it more readable.

In the example C is wrong


In the first example, A, segment 1 and 2 produce the same output, is correct
In the second example, you should set the initialization to number = 0, and the loop control variable to number <= 10 or number < 11

## 4.3 - Developing Algorithms Using Strings
### Verify that a String Contains a Substring
Given a String value, can we confirm that a particular substring exists within that String?
What tools/methods in Java do we have to complete this task?
- String.substring method: Retrieves a particular portion of a String
- String .equals method: Compares the content of 2 Strings
- String .length method: Returns the length of a String
- for loop: Allows us to repeat a task multiple times using a loop control variable

What is the algorithm?
- Given 2 Strings: word and sub
- Starting at beginning of word...
- Check correctly sized portion of word to see if its equivalent to sub
- If it is, keep track that we found it
- (If not) Shift word down one character to prepare to compare next portion
Repeat these steps while thare are still portions of word left to check
Then inform user whether or not you found it


// h

## 4.4 - Nested Iteration

## 4.5 - Informal Code Analysis
