package HomeWork5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {

    final static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {


        findSymbolOccurance("anton shevchenko", 'n');
        stringReverse("Anton");
        System.out.println(findWordPosition("Apollo", "llo"));
        System.out.println(isPalindrome("ere"));
        arrayWords();

    }
    public static void arrayWords () {
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



    public static String stringReverse (String reverse) {
        return new  StringBuilder(reverse).reverse().toString();
    }

    public static void findSymbolOccurance (String name, char symbol) {

        char[] arrayChars = name.toCharArray();
        int counter = 0;

        for (int i = 0; i < arrayChars.length; i++) {
            if (symbol == arrayChars[i]) {
                counter++;
            }
        }
        System.out.println("Символ зустрічається в переданому рядку " + counter + " рази");
    }

    public static int findWordPosition (String source, String target) {
        return source.indexOf(target);
    }

    public static boolean isPalindrome (String palindrome) {
       String str = new StringBuilder(palindrome).reverse().toString();
        return str.equals(palindrome);
    }



}
