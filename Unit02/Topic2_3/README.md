# 2.3 Calling a Void Method
**Methods** define the behaviors of all objects of a class and are a set of instructions for them to perform behaviors

## Procedural Abstraction
procedual abstraction let's you create methods to represent different behaviors without worrying about how it actually works; can just call a method and use it as wanted

Ex:
    program to write letters

    will have a method to call and create a greeting, a method to call and create special message/body, and a method to call and create a conclusion. Then finally a method to call all 3 previous methods and actually write the letter

In the example, `friendLetter()` calls `writeLetter()` and fins it at the top and goes to the first line of code which calls `greeting()` which prints out the greeting and then so on for the other methods


## Calling a void method
### Creating a Lamp
What is an attribute of the lamp?
    either on or off -- `isOn` (boolean)
What is the behavior of a lamp
    `turnOn` or `turnOff`

if you try to add `lamp3` to the example, it won't have any behviors because it's not intialized; it doesn't have `= new Lamp()`, you've just created the space and data for it to exist
If you tried to call `lamp3.turnOn()` it wouldn't work because the object is currently set to null, and can't perform that behavior (NullPointerError)