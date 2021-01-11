import java.util.Scanner;

public class VishniacovEA1FindAWords {
    public static void main(String[] args) {
        int  schet = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word for find: ");
        String s = scanner.nextLine();
        System.out.println("Your word: " + s);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();

        String a = "", b = "";


        for (int i = 0; i < text.length() - 1; i++) {
            a += text.charAt(i + 1);
            b += s.charAt(0);
            if (text.charAt(i) == ' ' && a.equalsIgnoreCase(b)) {
                for (int k = 1; k < s.length(); k++) {
                    a += text.charAt(i + 1 + k);
                    b += s.charAt(k);
                    if (b.equalsIgnoreCase(a)) {
                        a = "";
                        b = "";
                        if (k == s.length() - 1) {
                            schet++;
                        }
                    } else {
                        a = "";
                        b = "";
                        break;
                    }
                }
            }
            if (i == 0) {

                for (int k = 0; k < s.length(); k++) {
                    a="";
                    b="";
                    a += text.charAt(k);
                    b += s.charAt(k);
                    if (b.equalsIgnoreCase(a)) {
                        if (k == s.length() - 1) {
                            schet++;
                        }
                    } else {
                        break;
                    }
                }

            }
            a="";
            b="";
        }
        System.out.println(schet);





    }
}
