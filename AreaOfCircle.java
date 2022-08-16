import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entert the radius of the Circle: ");
        double r = sc.nextDouble();
        double area = 3.14 * (r * r);
        System.out.println("The area of the circle is: ");
        System.out.println(area);

    }
}
