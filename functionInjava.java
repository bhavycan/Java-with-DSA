import java.util.Scanner;

public class functionInjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = addition(a, b, c);
        System.out.println(sum);

    }

    public static int addition(int a, int b,int c){
        
        return  a+b+c;
    }
}
