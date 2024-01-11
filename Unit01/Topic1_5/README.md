# 1.5 Casting and Ranges of Variables
## What is casting
Casting is used in java to change the data type of a variable to another
Way that you write stuff changes the result you get (6/4 vs 6.0/4)
Casting can be used to round

# Video 2
Data types limited in how much info they can store
Integer max value: 2147483647
Integer min value: -2147483648
Can use `Integer.MAX_VALUE` and `Integer.MIN_VALUE` as shorthand for these
Double max: up to 14-15 digits
Won't provide expected outcome if you try to add or subtract over the limits

Example 1 won't result in an overflow, example 2 will

command line lets you just plug in numbers
`args` stands for arguments
`args` always string, have to find a way to turn a string into int or double when working with it
    `Double.parseDouble(args[0])`

Math random() only goes to from 0 to 1, can solve this by multiplying (and adding)
more than 1 command line argument, the first is 0, and the second is 1 (and so on)