import java.util.Scanner;

public class reverse_the_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp =0;
        for(int i = 0; num > 0 ; i++ ){
           int lastdegit = num%10;
        temp = (temp*10) + lastdegit;
        num /= 10;
        }
        System.out.println(temp);
    }
    
}
