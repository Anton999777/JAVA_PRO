package string;

public class StringLevelTwo {

    public String doubleChar(String str) {

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
           str2 = str2 + str.charAt(i);
        }
        String string = "";
        for (int i = 0; i < str2.length(); i++) {
            string = string + (str.substring(i,i+1) + str2.substring(i,i +1));
        }
        return string;
    }

    public int countHi (String str) {
        int counter = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i + 2).equals("hi")) {
                counter++;
            }
        }
        return counter;
    }

    public boolean catDog(String str) {
        int counterDog = 0;
        int counterCat = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i,i + 3).equals("cat")) {
                counterCat++;
            }
            if (str.substring(i,i + 3).equals("dog")) {
                counterDog++;
            }
        }
        if (counterDog == counterCat) {
            return true;
        } else {
            return false;
        }
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i,i + 2).equals("co")) {
                if (i + 4 == str.length() + 1) {
                    break;
                } else if (str.substring(i + 3, i + 4).equals("e")){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (b.endsWith(a)) {
            return b.endsWith(a);
        }
        else if (a.endsWith(b)) {
            return a.endsWith(b);
        } else {
            return false;
        }
    }
}
