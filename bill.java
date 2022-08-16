import java.util.*;
public class bill {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the total amount of the Pencil: ");
    float pencil = sc.nextFloat();
    System.out.print("Enter the total amount of the pen: ");
    float pen = sc.nextFloat();
    System.out.print("Enter the total amount of the paper: ");
    float paper = sc.nextFloat();

    float subtotal = pen + pencil + paper;
    System.out.println("Your Subtotal is: subtotal");
    float hst = (subtotal * 18)/100;
    System.out.print("HST/GST(18%) : ");
    System.out.println(hst);
    System.out.println("your Total is: ");
    System.out.print(subtotal + hst);
    }
}
