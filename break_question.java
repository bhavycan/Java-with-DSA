import java.util.Scanner;

public class break_question {
    public static void main(String[] args) {

//Keep Entering the number until we get the multiole of 10
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0) {
            if((n %= 10) == 0){
                System.out.println("Thanks We got that!");
                break;
            }
            System.out.print("Enter Your Integer: ");
            n = sc.nextInt();
        }
    }
}
