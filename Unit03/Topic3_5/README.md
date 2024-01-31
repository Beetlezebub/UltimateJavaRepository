# 3.5 - Compound Boolean Expressions
Nested conditional statements are just `if` statements in `if` statements
Dangling else (just basically not knowing which `if` an `else` belongs to, and it jumping to the incorrect if because it's closer); why we need curly braces

The output on the example segment would be "Line #2 // Line #4" because 16 is greater than 10, and isLate is false. The "Line #4" is printed, because it's outside all the `if` statements


## Logical Boolean Operators
Used to create larger and/or more complex boolean expressions wherever

`&&` (and): will evaluate to true only if both a *and* b are true (and so on for more variable involved)
`||` (or): will evaluate to true if a *or* b are true (and so on for other variables; both can be true,but only 1 *needs* to be)
`!` (not): evaluates to the opposite value of what a currenty is (i.e. anything but what a is)

In the example segment, it'll print out "Drive carefully!" because even though the temp is greater than 80, `isRaining` is true. Which also lets it print out "Drive carefully!"


## Short-Circuited Evaluation
It occurs when you don't need to fully evaluate a Boolean expression to know the final result
For `&&` statements, short-circuiting happens when the first half of the expression is false because there's no way for it to be true if the first half is already false, since both need to be true
For `||` statements, you can short-circuit if the first half of the expression is true

## How can short-circuiting be used to our advantage?
In the example, the values are set to 0. One half of the `if` asks if it's greater than zero, and ther second divides the second value by 80 and compares it to 80. Normally if it was just the second half there would be an error from dividing by 0, but because of the first half it short-circuits and skips the second half because the first value isn't greater than 0.