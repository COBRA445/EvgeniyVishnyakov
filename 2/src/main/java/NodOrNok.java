public class NodOrNok {
    public static int nod(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int nok(int a,int b) {
        return (a*b / nod(a, b));
    }
}
