 import java.util.Scanner;

public class calculator_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':   
            System.out.println(A + B);
                break;
        
                case '-':   
                System.out.println(A - B);
                    break;
                    case '*':   
                    System.out.println(A * B);
                        break;
                        case '/':   
                        System.out.println(A / B);
                            break;
            default:
            System.out.println("Something went Wrong");
                break;
        }

    }
}
