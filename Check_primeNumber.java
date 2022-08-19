import java.util.Scanner;

public class Check_primeNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean status = true;
        for(int i = 2; i <= n-1 ; i++){
            if(n % i == 0){
                status = false;
            }
            
            
    }
    if(status == true){
        System.out.println("Prime");
    }
    else{
        System.out.println("Not a Prime");
    }
}
}
