import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i != num) {
            sum += (i+1);
            i++;
            
        }
        System.out.println(sum);
    }
   
}
