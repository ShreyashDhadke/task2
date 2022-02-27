import java.util.Scanner;
    public class PermComb {
    private static void print(String str) {
        System.out.print(str);
    }
    private static void println(String str) {
        System.out.println(str);
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        int n, r;
        Scanner scan = new Scanner(System.in);
        println("To calculate the nCr and nPr values, we need 'n' and 'r' value .");
        print("Enter the value of n : ");
        n = scan.nextInt();
        print("Enter the value of r : ");
        r = scan.nextInt();
        int ncr = (factorial(n) / (factorial(n - r) * factorial(r)));
        int npr = (factorial(n) / (factorial(n - r)));
        println("nPr is : " + npr);
        println("nCr is : " + ncr);
    }
}


