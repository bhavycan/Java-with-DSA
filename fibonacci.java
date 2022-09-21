import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        int nextInt = 0;
        if(n == 0){
          nextInt = 0;
        }
        else if(n == 1){
            nextInt = 1;
        }
        else{
         
        for(int i = 1; i<n; i++){
            nextInt = t1 + t2;
            t1 = t2;
            t2 = nextInt;
        }
    }
        System.out.println(nextInt);

    }
    
}
