import java.util.Scanner;

public class continue_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            if(n % 10 == 0){
                System.out.println("We Skip the Number");
                continue;
            }

            System.out.println("Your Number is : " + n);
            
        } while (n>0);
    }
}
