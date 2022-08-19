import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        for(int i = 1; i <= 10; i++){
            product = n*i;
            System.out.println(n + " x " + i + " = " + product);
        }
    }
}
