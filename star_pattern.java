import java.util.Scanner;

public class star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 1;
        char ch = 'A';
        for(int i = 1; i<= n; i++){
            for(j = 1; j<=i; j++){
                System.out.print();
                
            }
            System.out.println();
            j += i;
        }



    }
}
