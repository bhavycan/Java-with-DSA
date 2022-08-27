import java.util.Scanner;

public class binomial_coefficiant {

    public static int findFactorial(int n){
        int f = 1;
        for(int i = 1; i <=n; i++){
            f *= i;
        }
        return f;
    }

    public static float findCoefficiant(int n, int r){
        int a = findFactorial(n);
        int b = findFactorial(r);
        int c = findFactorial(n-r);
        float result = a/(b*c);
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        System.out.println("Your answer is: " + findCoefficiant(n, r));

    }
}
