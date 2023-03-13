package string;

public class StringLevelOne {
    public String helloName(String name) {
        return name = "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return  out.substring(0,2) + word + out.substring(2,4);
    }

    public String extraEnd(String str) {
        int length = str.length();
        String str2 = str.substring(str.length() - 2, length);
        return str2 + str2 + str2;
    }

    public String firstTwo (String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0,2);
        }
    }

    public String firstHalf (String str) {
           return str.substring(0,str.length() / 2);
    }

    public String withoutEnd (String str) {
        return str.substring(1,str.length() - 1);
    }

    public String comboString (String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public String nonStart (String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.substring(1) + b.substring(1);
    }
}
