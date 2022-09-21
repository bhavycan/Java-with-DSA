import java.util.Scanner;

import javax.xml.validation.Schema;

public class prlindrom_number {
    
    public static int reversetheNumber(int n){
        int reverse = 0;
        while(n >0){
            reverse = (reverse* 10) +  n%10;
            n /= 10;
        
        }
        return reverse;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    int result =reversetheNumber(n);
        // System.out.println(result);

        if(result == n){
            System.out.println("Yes it is");
        }
        else{
            System.out.println("No it is not");
        }



    }
}
