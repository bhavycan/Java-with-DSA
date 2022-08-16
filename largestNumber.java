import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int A = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int B = sc.nextInt();
        if(A > B){
            System.out.println("You know " + (A) + ">" +  (B));
        }
        else{
            System.out.println("You know " + (A) + "<" +  (B) + " or " +  (A) + "=" +  (B) );
        }

        if((A % 2) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
    
}
