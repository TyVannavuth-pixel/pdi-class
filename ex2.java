import java.util.Scanner;
public class lap1Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("please enter a :");
        a = sc.nextInt();
        System.out.println("please enter b :");
        b = sc.nextInt();
        System.out.println("please enter c :");
        c = sc.nextInt();
        
        double delta;
        double x1, x2;
        delta = b * b - 4 * a * c;
        
        if (delta >= 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("the root is:" + x1);
            System.out.println("and:" + x2);
        } 
        else {
            System.out.println("the root is imaginary");
        }
        sc.close();
    }
}
