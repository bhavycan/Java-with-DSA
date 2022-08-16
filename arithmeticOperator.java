import java.util.Scanner;

public class arithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Arithmetic Operators:");
        System.out.print("First Number: ");
        int A = sc.nextInt();
        System.out.print("Second Number: ");
        int B = sc.nextInt();
        System.out.println("Add " + (A + B));
        System.out.println("Subtract " + (A - B));
        System.out.println("Multiply " + (A * B));
        System.out.println("Divide " + (A / B));
        System.out.println("Modulo " + (A % B));
        int C = A++;
        System.out.println(A);
        System.out.println(C);
        int D = B++;
        System.out.println(B);
        System.out.println(D);
    }
    
}
