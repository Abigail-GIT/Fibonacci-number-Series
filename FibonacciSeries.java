import java.util.Scanner;
class FibonacciSeries {
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    int a = 0;
    int b = 1;
    int c;
    System.out.println("Enter number for fibonacci series.");
    int n = s.nextInt();
    System.out.println(a + " " + b);
    for (int i = 2; i<n; i++) {
        c = a + b;
        System.out.println(" " + c);
        a = b;
        b = c;
    }
    }
}