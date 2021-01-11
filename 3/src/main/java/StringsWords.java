import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;

public class StringsWords {
    public static int howManyWords(String s) {
        int kolvoSimv = 0;
        int i = 1;
        while (i < s.length() - 1) {
            if (s.charAt(i - 1) == ' ' && s.charAt(i) != ' ') {
                kolvoSimv++;
            }
            i++;
        }
        int k = 0;
        if (s.charAt(0) == ' ') {
            kolvoSimv--;
            k++;
        }
        return kolvoSimv + 1;
    }


    public static ArrayList<String> sortWord(String s) {
        ArrayList<String> words = new ArrayList<String>();

        StringsWords strok = new StringsWords();
        int i = 0;
        int k = 0;
        String word = "";
        while (i < s.length()) {
            if (i == s.length() - 1) {
                word += s.charAt(i);
            }
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                words.add(word);
                word = "";

            } else if (s.charAt(i) == ',' || s.charAt(i) == '.' || s.charAt(i) == '(' || s.charAt(i) == ')') {
                word = word + "";
            } else {
                word += s.charAt(i);
            }

            i++;
        }

        Collections.sort(words);

        return words;
    }

    public static String capitalLetter(String s) {
        String stroka = "";

        stroka = stroka + s.substring(0, 1).toUpperCase();
        for (int i = 1; i < s.length(); i++) {
            if (" ".equals(s.substring(i - 1, i))) {
                stroka = stroka + s.substring(i, i + 1).toUpperCase();

            }
            else
                stroka = stroka + s.substring(i, i + 1);
        }

        return stroka;
    }

    public static String[] numberOfLetters(String s) {


        StringsWords strok = new StringsWords();
        int howManyWords = strok.howManyWords(s);
        int[] k = new int[howManyWords];
        int j = 0;
        String[] words = new String[howManyWords];
        for (int i = 0; i <= strok.howManyWords(s) - 1; i++) {
            k[i] = strok.sortWord(s).get(i).length() / 2;
            words[i] = strok.sortWord(s).get(i);
            j++;
        }


        boolean isSorted = false;
        int buf;
        String strok2;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < k.length - 1; i++) {
                if (k[i] > k[i + 1]) {
                    isSorted = false;

                    buf = k[i];
                    k[i] = k[i + 1];
                    k[i + 1] = buf;

                    strok2 = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = strok2;
                }
            }
        }
      return words;
    }
}

