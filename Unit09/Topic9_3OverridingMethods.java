package Unit09;

public class Topic9_3OverridingMethods {
    public static void main(String[] args) {
        Comedian amy = new Comedian("Amy", 29);
        System.out.println("My name is " + amy.getName());
        amy.getName();
        amy.practice();
        amy.perform();
    }
}

class Perfomer {
    private String name;
    private int age;

    public Perfomer() {
        name = "The Performer";
        age = 16;
    }

    public Perfomer(String n, int a) {
        name = n;
        age = a;
    }
    public String getName() {
        return name;
    }
    public void practice() {
        System.out.println("Honing my craft!");
    }
    public void perform() {
        System.out.println("Performing for an audience!");
    }
}

class Comedian extends Perfomer {
    // private ArrayList<String> jokes;

    public Comedian(String n, int a){
        //h
    }

    public void writeJokes(){
        //Adds jokes to the ArrayList
    }

    // public void perform(){
    //     for(String joke : jokes){
    //         System.out.println(joke);
    //     }
    // }
}