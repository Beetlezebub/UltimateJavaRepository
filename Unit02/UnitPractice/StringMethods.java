package Unit02.UnitPractice;

public class StringMethods {

    public static String helloName(String name) {
        System.out.println("Hello " + name + "!");
        return ("Hello " + name + "!");
    }

    public static String firstHalf(String str) {
        int halfIt = (str.length()/2);
        String firHal = str.substring(0, halfIt);
        System.out.println(firHal);
        return firHal;
    }

    public static boolean endsLy(String str) {
        return false;
    }

    public static String makeAbba(String a, String b) {
        String fullThing = a + b + b + a;
        System.out.println(fullThing);
        return fullThing;
    }

    public static String withoutEnd(String str) {
        String cutOut = str.substring(1, (str.length()-1));
        System.out.println(cutOut);
        return cutOut;
    }

    public static String nTwice(String str, int n) {
        String firstPart = str.substring(0, n);
        String secPart = str.substring((str.length() - n), str.length());
        String full = firstPart + secPart;
        System.out.println(full);
        return full;
    }

    public static String makeTags(String tag, String word) {
        String strtTag = ("<" + tag + ">");
        String endTag = ("</" + tag + ">");
        String tagged = (strtTag + word + endTag);
        System.out.println(tagged);
        return tagged;
    }

    public static String middleTwo(String str) {
        String mid1 = str.substring(((str.length()/2) - 1), ((str.length()/2) + 1));
        String mid2 = str.substring((str.length()/2), (str.length()/2));
        System.out.println(mid1 + mid2);
        return (mid1 + mid2);
    }

    public static void main(String[] args) {
        // You can test your methods for specific inputs here. For example:
        // System.out.println("helloName(\"Bella\") -> " + helloName("Bella"));
        helloName("string");
    }
}
