import java.util.Scanner;

public class decimal_to_binary {

    public static int convertNumber(int n){
        int binary = 0;
        int pow = 0;
        while(n >0){
           
            binary += (n%2) * (int)Math.pow(10, pow);
            pow++; 
            n /=2;
        }

        return binary;
    }

    public static int sumofInteger(int n){
        int sum = 0;
        while(n>0){
            
            sum += n%10;
            n /= 10;

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = convertNumber(n);
        int answer = sumofInteger(n);
        System.out.println("The bunary form is: " + result);
        System.out.println("The bunary form is: " + answer);
    }
}
