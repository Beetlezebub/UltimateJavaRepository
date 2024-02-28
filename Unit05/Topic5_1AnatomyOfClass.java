package Unit05;

public class Topic5_1AnatomyOfClass {
    public static void main(String[] args) {
        
    }
}

public class Snack {
    private String name;
    private int calories;
    // private instance variables (attributes)
    // set values in constructors 
    
    public Snack(){  
        name = "";      // default constructor
        calories = 0;
    }
    
    public Snack(String n, int c) {  //parameters set values of instance variables
        name = n;      // overloaded constructor
        calories = c;
    }
    
    public getName(){             // ┓
        return name;              // ┃
    }                             // ┃
                                  // ┣━━ accessor methods (gives access to the values of private instance variables)
    public String getCalories() { // ┃
        return calories;          // ┃
    }                             // ┛
    
    public void setName (String n) { // ┓
        name = n;                    // ┃
    }                                // ┃
                                     // ┣━ mutator methods (allows us to potentially modify or change values of instance variable)
    public void setCalories(int c) { // ┃
        calories = c;                // ┃
    }                                // ┛

    private boolean canEat() {
        return (calories < 150);
    }
}