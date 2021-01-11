
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.IOException;




public class VishniacovEA1_HowManyWords {


    public static void main(String[] args) {



        boolean exit = true;
        Scanner scanner = new Scanner(System.in);
        StringsWords stroka = new StringsWords();
        System.out.println("Enter a suggestion: ");

        String s = scanner.nextLine();

        System.out.println("What should I do with your offer?");
        System.out.println("\"1\" - Number of words in a sentence");
        System.out.println("\"2\" - Sort your string alphabetically");
        System.out.println("\"3\" - Sort your string by the number of letters in the word");
        System.out.println("\"4\" - Make every first letter of the word capitalized");  //!!!!в консоли работате только с английским языком!!!!!!!
        System.out.println("\"Close\" - Exit the program");
        while (exit)
            switch (scanner.nextLine()) {
                case ("Close"):
                    exit = false;
                    System.out.println("The program is completed!");
                    break;
                case ("1"):
                    System.out.println("In your offer " +  stroka.howManyWords(s) + " words.");
                    break;
                case ("2"):
                    System.out.println("Your sorted sentence alphabetically: ");
                    for (int i = 0; i <= stroka.howManyWords(s) - 1; i++) System.out.println(stroka.sortWord(s).get(i));
                    break;
                case ("3"):
                    System.out.println("Your sorted sentence by the number of letters in the word: ");
                    for (int i = 0; i < stroka.howManyWords(s); i++) {
                        System.out.println(stroka.numberOfLetters(s)[i]);
                    }
                    break;
                case ("4"):
                    System.out.println("In your sentence, all letters are uppercase: ");
                    System.out.println(stroka.capitalLetter(s));
                    break;

            }
    }
}
