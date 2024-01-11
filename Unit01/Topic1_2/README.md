# 1.2 Variables and Data Types
Primitive data decides the size an dtype of information
    boolean: Smallest data we can represent; True/False
    int: represent simple, basic values, whole numbers; add, subtract, etc.
    double: decimal values, referred to as floating-point numbers
    can represent data as text
        Ex: "Hello World!"
        can refer to it as a welcomeMessage and store that info there so it can refer to it
    Can you data types for reference purposes
    boolean usually only takes up 1 bit, int usually 32, and double usually 64

## What's the difference
Primitive types already part of java language. Except for String, non-primitive types are usually created by the programmer
Non-primitive types can use methods to perform actions, but primitive types can't

Each variable has associated memory that is used to hold its value
The memory associated with a variable of a primitive type holds an actual primitive value
When a variable is declared final is  value can't be changed once it's initialized

## What is a variable?
A variable is a name given to a memory location that is holding a specified type of value

## Naming a variable

May consist of letter, digits, or an underscore (case sensitive)
May not start with a digit
Spaces aren't allowed
May not use any other characters such as "&", "@", or "$"
May not use Java reserved word (e.g. "public", "static", "void", etc.)
Variable names should start with lowercase and use "camel case" if more than one word: thisIsAGoodExample

## Declaring variable in code
Three primitive data types in Java:
    Integers: int
    Decimals: double
    Boolean valuse: boolean

dataType variableName;
EX: `int total;`, `double intRate;`, `boolean giveBonus;`

"final" used for variable that can't be changed once given a value
    Ex: `final double PI;`, `final int DAYS_IN_WEEK;`, `final boolean JAVA_ROCKS`
When naming final variables we use ALL CAPS and underscores

1, 6, 7, 8, 10, and 12 are valid