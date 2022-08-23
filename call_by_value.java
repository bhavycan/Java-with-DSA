import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class call_by_value {
    
    public static void product(int a,int b,int result){
        result = a * b;
        System.out.println(result); //result = a*b
    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        product(a,b,result);
        // System.out.println(result); result = 0 
    }
}
