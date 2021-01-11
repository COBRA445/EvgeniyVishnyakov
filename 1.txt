

import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.IOException;

public class VishniacovEA1_SimleOrNo {
     public static void main(String[] args) {

            int k = 0;
            int num = 0;
            boolean exit = true;
            Scanner scanner = new Scanner(System.in);


            System.out.println("To exit the program, enter \"Close\"");
            System.out.println("Enter an integer: ");

            //  while (scanner.nextLine() != "Close") {
            while(exit){
                if (scanner.hasNextInt())
                {
                    num = scanner.nextInt();
                    if (num % 2 == 0)
                    {
                        System.out.println(String.format("The number %d is even", num));
                    } else {
                        System.out.println(String.format("The number %d is odd", num));
                    }

                    for (int i = 2; i < num; i++)
                    {
                        if (num % i == 0)
                        {
                            k++;
                            break;
                        } else {
                        }
                    }

                    if (k == 0)
                    {
                        System.out.println(String.format("The number %d is simple", num));
                    } else {
                        System.out.println(String.format("The number %d of composite", num));
                    }
                    System.out.println();
                    System.out.println("Enter an integer or \"Сlose\" to exit the program: ");

                } else {
                    if (scanner.nextLine() != "Close") {
                        exit = false;
                        break;
                    } else {
                        System.out.println("You didn't enter an integer");

                    }

                    System.out.println();
                }


            }
        }
    }

