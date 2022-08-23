import java.util.Scanner;
public class Inverted_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 1;
        for(int i = n; i>= 1; i--){
            for(j = 1; j<=i; j++){
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
}
