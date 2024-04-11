package Unit09;

public class Topic9_2WritingConstructorsForSubclasses {
    public static void main(String[] args) {

    }
}

// public class Perfomer {
//     private String name;
//     private int age;
//     public Perfomer() {
//         name = "The Performer";
//         age = 16;
//     }
//     public Performer(String n, int a) {
//         name = n;
//         age = a;
//     }
// }

// public class Musician extends Performer {
//     private String instrument;
//     public Musician() {
//         super();
//         instrument = "Piano";
//     }
//     public Musician(String inst) {
//         super();
//         instrument = inst;
//     }
//     public Musician(String n, int a, String inst){
//         super(n, a);
//         instrument = inst;
//     }
// }
// [✓]
// [X]
//Performer wynton = new Performer(); [✓]
// Musician branford = new Musician(); [✓]
//Performer wynton = new Performer("Wynton", 19); [✓]
//Musician branford = new Musician("Branford", 20); [X]
//Musician branford = new Musician("Saxophone"); [✓]
//Performer wynton = new Performer("Trumpet"); [X]