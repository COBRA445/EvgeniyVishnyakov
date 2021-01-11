
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.IOException;




public class VishniacovEA1_NodOrNok {
    public static void main(String[] args) {


        int a, b;
        boolean exit = true;
        String close = "Close";
        Scanner scanner = new Scanner(System.in);
        NodOrNok chislo = new NodOrNok();
        System.out.println("To exit the program, enter \"Close\"");
        System.out.println("Enter two integers: ");


       while(exit) {
           if (scanner.hasNextInt()) {
               a = scanner.nextInt();
               //if (scanner.hasNextInt()) {
               b = scanner.nextInt();
                   System.out.println("Smallest common multiple of numbers " + a + " and " + b + " = " + chislo.nod(a, b));
                   System.out.println("Greatest common divisor of numbers " + a + " and " + b + " = " + chislo.nok(a, b));
                   System.out.println();
                   System.out.println("Enter two integers or \"Сlose\" to exit the program: ");
              // }
               } else {

                   if (close.equals(scanner.nextLine())) {
                       exit = false;
                       System.out.println("The program is completed!");
                       break;
                   } else {
                       System.out.println("You didn't enter an INTEGER!");

                   }
               }
             //  System.out.println();
           }
       }



       }







