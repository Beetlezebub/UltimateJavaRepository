# 3.7 - Comparing Objects
[come back and type out reference at start of first video]
There are 4 object references (variables) in the exxample, and 3 objects

`myHouse` and `annasHouse` refer to 2 separate objects with identical attributes
`myHouse` and `momsHouse` are aliases for the same `House` object
`bobsHouse` does not reference an object (because it's null)

[type out 2nd code example]


Often classes have their own equals method that can be used to determine whether 2 objects of the class are equivalent

## The equals Method
`equals` method is a boolean method used to determine if 2 objects are equivalent by comparing their attributes
Method will return true if the objects are equivalent, false if not
The programmer is the person who determines how attributes are compared 

[get house code segment example from second video]

in second example, the first expression would return true because box and fourSides have the same attributes of (10, 10, 200, 200). and blanket *is* null
The second expression would return would return false because eeven though box does equal fence (because fence equals box), quad ((20, 20, 10, 10)) is not equal to fourSides
the third expression isnt correct because neither equals to makes fourSides equal to box
