import java.util.Scanner;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, month, day;
        
        System.out.println("Please enter your year of birth :");
        year = input.nextInt();
        
        System.out.println("Please enter your month of birth :");
        month = input.nextInt();
        
        System.out.println("Please enter your day of birth :");
        day = input.nextInt();
        
        System.out.println("Input: " + year + "-" + month + "-" + day);
        
        if (year > 2026) {
            System.out.println("output invalid");
        else if (month > 12 || month < 1) {
            System.out.println("output invalid");
        }
        else if (day > 31 || day < 1) {
            System.out.println("output invalid");
        }
            System.out.println("output valid");
        
        input.close();
    }
}
