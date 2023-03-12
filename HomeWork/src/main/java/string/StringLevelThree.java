package string;

import java.util.Arrays;

public class StringLevelThree {

    public int countYZ (String str) {
        int counter = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' || str.charAt(i) == 'y') {
                if (i == str.length() -1) {
                    counter++;
                    break;
                } else if (Character.isLetter(str.charAt(i + 1))) {
                   continue;
                } else {
                    counter++;
                }
            }
        }
        return counter;
    }

    public String withoutString (String base, String remove) {
        String str = "";
        String word ="";

        for (int i = 0; i < base.length() - 1; i++) {
            word = base.substring(i, i + remove.length());
            if (remove.equalsIgnoreCase(word)) {
                i = i + remove.length() - 1;
            } else {
                str = str + base.substring(i, i + 1);
            }
        }
        if (word.equalsIgnoreCase(remove)) {
            if (base.substring(remove.length() - remove.length(),remove.length()).equalsIgnoreCase(remove)) {
                return str;
            }
            str = str + base.charAt(base.length() - 1);
        } else  if (word.substring(word.length() - 1).
                equalsIgnoreCase(base.substring(str.length()-1))) {

        } else {
            char symbol = base.charAt(base.length() - 1);
            str = str + symbol;
        }
        return str;
        }
    }
