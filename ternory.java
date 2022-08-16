import java.util.Scanner;

public class ternory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String report = (marks > 33) ? "PASS" : "FAIL";
        System.out.println("The Result is: " + report);

    }
}
