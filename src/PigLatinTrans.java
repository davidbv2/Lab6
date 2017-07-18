/**
 * Created by Grand Circus Student on 7/15/2017.
 */
import java.util.Scanner;
public class PigLatinTrans {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userWord = "";

        System.out.println("Welcome to the Pig Latin Translator!");
        System.out.println();
//        System.out.print("Please enter a word: ");
//        userWord = scan.nextLine();
//        System.out.println();


        do {
            System.out.print("Please enter a word:");
            userWord = scan.nextLine();

        } while (userWord.length() == 0 || (userWord.trim() != userWord));


        System.out.println("Thank you! You entered the word:" + userWord + ".");

        System.out.println(eng2Pig(userWord));

    }


    public static String eng2Pig(String userWord) {

        String lowerCase = userWord.toLowerCase();

        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';
        String vowelFirst = lowerCase + "way";
   
        for (i = 0; i < lowerCase.length(); i++) {
           char letter = lowerCase.charAt(i);
            //System.out.println(letter);
            if (letter == a || letter == e || letter == i || letter == o || letter == u) {
                            String consonant1 = lowerCase.substring(i);
                            String consonant2 = lowerCase.substring(0,i) + "ay";
                            System.out.println(consonant1 + consonant2);
                            break;
//                System.out.println(vowelFirst);
            }

        }


            //if i is 0--first letter vowel
            //  create a new string and add -way
            //otherwise
            //  create a new string starting with this vowel
            //    (position i through end)
            //  add the letters from 0 up to i
            //  add -ay
            //output the new string
            //exit the loop


        return vowelFirst;

    }
}



//    if (lowerCase.indexOf('a') == 'a'){
//            System.out.println(lowerCase.indexOf('a'));
//            } else

