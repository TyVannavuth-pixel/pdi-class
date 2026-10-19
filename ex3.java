import java.util.Scanner;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e;
        
        System.out.println("please enter the 1st number :");
        a = input.nextInt();
        
        System.out.println("please enter the 2nd number :");
        b = input.nextInt();
        
        System.out.println("please enter the 3rd number :");
        c = input.nextInt();
        
        System.out.println("please enter the 4th number :");
        d = input.nextInt();
        
        System.out.println("please enter the 5th number :");
        e = input.nextInt();
        
        int max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
        int min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min); input.close();
    }
}
