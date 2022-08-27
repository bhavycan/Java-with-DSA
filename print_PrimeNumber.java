import java.util.Scanner;

public class print_PrimeNumber {

    public static boolean CheckPrimeNumber(int a){
       boolean check = true;
        for(int i = 2; i<=a-1; i++){
            if(a % i == 0){
              check = false;
               
            }
           
        }
        return check;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i<=n; i++){
            boolean check = CheckPrimeNumber(i);
            if(check == true){
                System.out.println(i);
            }
        }

    }
}
