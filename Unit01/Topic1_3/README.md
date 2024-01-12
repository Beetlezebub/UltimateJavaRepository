# 1.3 Expressions and Assignment Statements
Literal: source of code representation of a fixed value
String Literal: enclosed in quotations

## Arithmatic Operators
Addition +
Sudtraction -
Multiplication *
Division /
Modulus %
Result of all operations will automatically be the same as the digits put in, and if combining types, then it'll be whichever has the bigger data type
Modulos get their answer number from the remainder when you divide 2 numbers
    Ex: 17/5 = 3
        17%5 = 2


Compound Expression: Take operators and make more complex expressions
    Ex: 8*6-14%3+8/2

## Operator Precedence
[() * / % + - =]


## The Assignment Operator
`=` is an instruction that assigns a value (what's on the right sign of the operator) to a variable (on the left side)
Can't assign something to a variable with the variable on the right and the value on the left (7 = x (in this case, cause 7 already has a value))
The operators all run right to left (at least the ones we know right now), but `=` actually runs left to right
    Ex: `x = y = z = 6`
        Here, it would first assign 6 to z, then assign z to y, then assign y to x
