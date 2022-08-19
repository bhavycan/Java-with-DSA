import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
       
        int product = 1;
       int flag;

       do {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Only Positive Number Please");
            flag = 1;
        }
        else{
            for(int i = n; i>0; i--){
                product *= i;
            }
            System.out.println("The Factorial is: " + product);
            flag = 0;
        }
        
       } while (flag == 1);


        
      
    }
}
