package Unit04;

public class StringLoops {

    public static boolean xyzThere(String str) {

        for (int i = 0; i <= str.length() - 3; i++) {
            // found an "xyz"
            if (str.substring(i, i + 3).equals("xyz")) {
                // if it's a ".xyz"
                if (i > 0 && str.substring(i - 1, i).equals(".")) {
                    // do nothing
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static String zipZap(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 3; i++) {
            // if I find zip, zap, zsp, etc
            if (str.substring(i, i + 1).equals("z") &&
                    str.substring(i + 2, i + 3).equals("p")) {
                result += "zp";
                i += 2;
            } else {
                result += str.substring(i, i + 1);
            }
        }

        if (str.length() < 3) {
            result += str;
        } else if (str.substring(str.length() - 3, str.length() - 2).equals("z") &&
                str.substring(str.length() - 1).equals("p")) {
            // do nothing
        } else {
            result += str.substring(str.length() - 2);
        }

        return result;
    }

    public static String doubleChar(String str) {
        String dchar = "";
        for (int i = 0; i <= str.length() - 1; i++){
            dchar += str.substring(i, i+1) + str.substring(i, i+1);
        }
        System.out.println(dchar);
        return dchar;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 4; i++){
          if (str.substring(i, i + 2).equals("co")){
            if (str.substring(i + 3, i + 4).equals("e")){
              count = count + 1;
            }
          }
        }
        System.out.println(count);
        return count;
    }

    public static boolean bobThere(String str) {
        boolean check = false;
        for (int i = 0; i <= str.length() - 3; i++){
          if (str.substring(i, i + 1).equals("b")){
            if (str.substring(i + 2, i + 3).equals("b")){
              check = true;
            }
          }
        }
        System.out.println(check);
        return check;
    }

    public static boolean prefixAgain(String str, int n) {
        //come back idk what's going wrong
        boolean check = false;
        for (int i = 0; i <= str.length() - n; i++){
            if (str.substring(i, i + n).equals(str.substring(0, i + n))){
                check = true;
            }
        }
        System.out.println(check);
        return check;
    }

    public static boolean sameStarChar(String str) {
        boolean check = false;
        int i = 0;
        while (i <= str.length() - 2){    
            if (!(str.substring(i, i + 1).equals("*"))){
                // nothing
            } else if (str.substring(i, i + 1).equals("*")){
                String char1 = (str.substring(i - 1, i));
                String char2 = (str.substring(i + 1, i + 2));
                if (char1.equals(char2)){
                    check = true;
                } else{
                    check = false;
                }
            }
            i++;
        }
        System.out.println(check);
        return check;
    }
    //|| lowb.substring(i, i + lowa.length()).equals(lowa)
    // || i <= b.length() - a.length(); i++

    public static String starOut(String str) {
        return "";
    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 2; i++){
          if (str.substring(i, i + 2).equals("hi")){
              count = count + 1;
          }
        }
        System.out.println(count);
        return count;
    }

    public static boolean endOther(String a, String b) {
        boolean check = false;
        String lowa = a.toLowerCase();
        String lowb = b.toLowerCase();
        if (lowa.length() > lowb.length()){
            if (lowa.substring((lowa.length() - lowb.length()), lowa.length()).equals(lowb)){
                check = true;
            }
        } else if (lowb.length() > lowa.length()){
            if (lowb.substring((lowb.length() - lowa.length()), lowb.length()).equals(lowa)){
                check = true;
            }
        } else if (lowa.length() == lowb.length()){
            if (lowa.substring((lowa.length() - lowb.length()), lowa.length()).equals(lowb) || lowb.substring((lowb.length() - lowa.length()), lowb.length()).equals(lowa)){
                check = true;
            }
        }
        System.out.println(check);
        return check;
    }

    public static boolean xyBalance(String str) {
        return false;
    }

    public static String plusOut(String str, String word) {
        String newStr = ("");
        int i = 0;
        while (i <= str.length() - word.length()){
          if (str.substring(i, i + word.length()).equals(word)){
            newStr = newStr + word;
            i = i + word.length();
          } else{
            newStr = newStr + "+";
            i++;
          }
        }
        return newStr;
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i <= str.length() - 3; i++){
            if (str.substring(i, i + 3).equals("cat")){
                catCount = catCount + 1;
            } else if (str.substring(i, i + 3).equals("dog")){
                dogCount = dogCount + 1;
            }
        }
        if (catCount == dogCount) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static String mixString(String a, String b) {
        return "";
    }

    public static String repeatSeparator(String word, String sep, int count) {
        return "";
    }

    public static void main(String[] args) {
        // You can test your methods for specific inputs here. For example:
        // System.out.println("helloName(\"Bella\") -> " + helloName("Bella"));
        sameStarChar("xy*yzz");
    }
}
