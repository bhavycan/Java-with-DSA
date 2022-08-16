import java.util.Scanner;

public class typesConv_Cast_Pro {
    public static void main(String args[]){
        
        //type conversion
        int a = 5;
        double b =a;
        System.out.println(b);

        // double c = 5.0;
        // int d =c;                Error


        //Type casting 
        float c = 3.14f;
        System.out.println((int)c);


        //Type Promotion in Expression
        char d = 'a';
        char e = 'b';
        System.out.println(e-d);
        //convert d ---> 97
        //conver e ---> 98
        //then minus it


        int num1 = 56;
        double num2 = 56.2;
        System.out.println(num1+ num2);

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int check = i>j ? i:j;
        System.out.println(check);

        




    }
}
