
import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Scanner;


public class VishniacovEA5_FindAPalindrome {                                    //по заданию для чисел <100!!!
    public static void main(String[] args) {
        int  schet = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Up to what number do I need to find palindromes?: ");

        if(scanner.hasNextInt()) {
            int s = scanner.nextInt();
            if(s < 0) {
                System.out.println("Please enter a positive number!");
            }
            if(s <= 10 && s > 0) {
                System.out.println("Digits don't have palindromes");
            }
             if(s <= 100 && s > 10) {
                //ArrayList<Integer>
                for(int i = 0; i <= s; i++){
                    if (i % 10 == i / 10){
                        System.out.println(i);
                    }
                }
            }
             else {
                 System.out.println("Enter an integer number < 100!"  );
             }
        } else {
            System.out.println("Enter an integer number < 100!"  );
        }
    }
}
/*
public class VishniacovEA5_FindAPalindrome {                                //Для любых чисел
    public static void main(String[] args) {
        int k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Up to what number do I need to find palindromes?: ");
        String a = "", b = "";
        if(scanner.hasNextInt()) {
            int s = scanner.nextInt();
            if (s >= 10) {
                for (int i = 10; i <= s; i++) {
                    k = i;
                    while (k != 0) {
                        a = a + (k % 10);
                        k = k / 10;
                    }
                    for (k = a.length() - 1; k >= 0; k--) {
                        b = b + a.charAt(k);
                    }

                    if (a.equals(b)) {
                        System.out.println(b);
                    }
                    a = "";
                    b = "";
                }
            } else {
                System.out.println("Enter an integer number > 10!");
            }
        } else {  System.out.println("Enter an integer number > 10!");}
    }
}
*/