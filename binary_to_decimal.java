
import java.util.Scanner;

public class binary_to_decimal {

public static int findPower(int i){
    int product = 1;
    for(int j = 1; j <= i ;  j++){
        if(i > 0 ){
            product *=  2; 
        }
    
    }
    return product;
}

public static int finddigit(int n){
    return (n%10);
}

    public static int findDecimal(int n){
        int decimal =  0;
        for(int  i = 0; n > 0; i++){
            int term = findPower(i) * finddigit(n);
            n /= 10;
            decimal += term;
        }
        return decimal;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = findDecimal(n);
        System.out.println(number);
    }
}
