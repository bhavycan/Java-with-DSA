import java.util.Scanner;

public class loopQuestion {
    public static void main(String[] args) {
     
        int oddNumberSum = 0;
        int evenNumberSum = 0;
        int flag;
        do {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n % 2 == 0){

                System.out.println("This is the Even Number");
                evenNumberSum += n;
            }
            else{
                System.out.println("This is the odd Number");
                oddNumberSum += n;
            }

            System.out.println("Hey! Do you want to add more Number? [yes = 0][ No = 1] ");
            flag = sc.nextInt();
            
            
        } while (flag == 0);

        System.out.println("The sums of Even Number: " + evenNumberSum );
        System.out.println("The Sum of odd Number: " + oddNumberSum);
    }
}
