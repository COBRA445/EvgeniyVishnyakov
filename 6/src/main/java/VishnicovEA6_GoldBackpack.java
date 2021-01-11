import java.util.Scanner;


public class VishnicovEA6_GoldBackpack {
    public static void main(String[] args) {

        // S - масса рюкзака, n - количество предметов
        //M - масса каждого предмета, P - ценность каждого предмета
        // F - двумерный массив


        int n = 0, S = 0;
        System.out.println("Введите грузоподъемность рюкзака:");
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;

        while (exit)
            {
                if (scanner.hasNextInt()) {
                    S = scanner.nextInt();
                    exit = false;
                } else {
                    System.out.println("Введите целое число!");
                }
            }
        exit = true;
        while (exit) {
            System.out.println("Введите количество вещей:");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                exit = false;
            } else {
                System.out.println("Введите целое число!");
            }
        }
            int[] M = new int[n+1];
            M[0] = 0;
            int[] P = new int[n+1];
            P[0] = 0;
            int[][] F = new int[n+1][S+1];
            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= S; j++){
                    F[i][j] = 0;
                }
            }

            for(int i = 1; i < n+1; i++){
                    exit = true;
                    while (exit) {
                        System.out.println("Введите массу " + i + " вещи:");
                        if (scanner.hasNextInt()) {
                            M[i] = scanner.nextInt();
                            exit = false;
                        } else {
                            System.out.println("Введите целое число!");
                        }
                    }
                    exit = true;
                    while (exit) {
                        System.out.println("Введите стоимость " + i + " вещи:");
                        if (scanner.hasNextInt()) {
                            P[i] = scanner.nextInt();
                            exit = false;
                        } else {
                            System.out.println("Введите целое число!");
                        }
                    }
            }

            for (int i = 1; i <= n; ++i)
            {
                for (int j = 0; j <= S; ++j)
                {
                    if (j >= M[i])
                    {
                        if(F[i - 1][j] >= F[i - 1][j - M[i]] + P[i]) {
                            F[i][j] = F[i - 1][j];
                        } else {
                            F[i][j] =  F[i - 1][j - M[i]] + P[i];
                        }
                     }
                    else
                        F[i][j] = F[i - 1][j];
                }
            }

            for (int i = 0; i < n + 1; ++i)
            {
                for (int j = 0; j < S + 1; ++j)
                {
                    System.out.print(F[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            //int* Ans = new int[n];
            int[] Ans = new int[n+1];
            int tmp = S;
           for (int i = Ans.length - 1; i > 0; --i)
            {
                if (F[i][tmp] != F[i - 1][tmp])
                {
                    Ans[i] = i;
                    tmp -= M[i];
                }
                else
                    Ans[i] = 0;
            }
        System.out.println("В рюкзак нужно положить вещи под номерами: ");
            for (int i = 1; i < n + 1; ++i)
                if (Ans[i] != 0)
                System.out.print(Ans[i] + " ");


    }
}
