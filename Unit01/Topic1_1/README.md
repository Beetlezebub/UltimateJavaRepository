# 1.1 Why Programming? Why Java? 

## Leaving Notes in README.md Files

Leave notes here of things you learn while watching the videos. This file is in Markdown format, which allows you to include **bold** and _italic_ text, as well as lists, links, and images. An information-dense cheatsheet for Markdown can be found [here](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

## Trying Out Code in Main.java Files

The `Main.java` files in each folder are meant to be used to try out the code you see in the videos, to experiment with your own code, and to explore the code referenced in the assigned questions. 

There should be a "Run" button at the top of the editor window that will compile and run the code in the `Main.java` file. I also encourage you to occasionally compile and run the code from the command line as this offers additional flexible ways of running the code (more details later). If your terminal is at the base directory (`UltimateJavaRepository`), you can compile and run the files like so:

```
javac Unit01/Topic1_1/Main.java
java Unit01.Topic1_1.Main
```

Sorry about the more complicated syntax for running the code from the command line; it's a necessary Java thing if you're going to keep your code organized in a big repository like this.

# Skill 2.B
## Video 1
main Method controls all code (i.e. public static void main (String[] args))
System.out generates the console's output
    Can make it print (System.out.print); dispalys whatever in ()
    Can make it print and move cursor (System.out.println); same as other just moves cursor to next line

## Video 2
String literal enclosed in double quotes
String literal is an exact sequence of characters enclosed in 2 quotation marks
Syntax error is when you violate the syntax of what your code does


# Skill 4.B
## Video 3
Types of Java errors: Syntax error, exception, logic error
    Logic error
        Ex: Programmer accidentally uses a minus instead of plus when finding the sums of 2 numbers
    Exception
        Ex: The program attempts to divide by 0

### Errors
Second line "print" is misspelled and missing second quote
Third line has a backwards 2nd quotation mark
Fourth line is missing a period between "System" and "out"
Last line's "s" of "system" is lowercase and missing a semicolon