package HomeWork5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    final static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {


//        System.out.println(findSymbolOccurance("anton", 'n'));
//        System.out.println(stringReverse(null));
//        System.out.println(findWordPosition("hello", "ar"));
        System.out.println(isPalindrome(null));
//        guessTheWordGame();

    }
    public static void guessTheWordGame () {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int numberComputer = random.nextInt(words.length);
        System.out.println("Вгадайте слово, загадане комп'ютером" + numberComputer);
        while (true) {
            String inputUser = scanner.nextLine().toLowerCase();
            String wordComputer = words[numberComputer];

            if (inputUser.equals(wordComputer)) {
                System.out.println("Ви вгадали! Вітаю!!! :)");
                break;
            } else {
                StringBuilder str = new StringBuilder();
                for (int i = 0; i < words.length; i++) {

                    if (i == inputUser.length() || i == wordComputer.length()){
                        str.append("############");
                        break;
                    }
                    if (inputUser.charAt(i) == wordComputer.charAt(i)) {
                        str.append(inputUser.charAt(i));
                    } else {
                        str.append("#");
                    }
                }
                System.out.println("Спробуйте ще раз:  " + str);
            }
        }
    }



    public static String stringReverse (String source) {
        if (source == null) {
            return "Ошибка!";
        } else {
            return new StringBuilder(source).reverse().toString();
        }
    }
    public static int findSymbolOccurance (String name, char symbol) {

        if (name == null) {
            return 0;
        } else {
            char[] symbols = name.toCharArray();
            int counter = 0;

            for (int i = 0; i < symbols.length; i++) {
                if (symbol == symbols[i]) {
                    counter++;
                }
            }
            return counter;
        }
    }

    public static int findWordPosition (String source, String target) {
        if (source == null && target == null) {
            return -1;
        } else {
            return source.indexOf(target);
        }
    }
    public static boolean isPalindrome (String palindrome) {
        if (palindrome == null) {
            return false;
        } else {
            String str = new StringBuilder(palindrome).reverse().toString();
            return str.equals(palindrome);
        }
    }
}
