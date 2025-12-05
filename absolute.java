import java.util.Scanner;

public class absolute {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number to find absolute value");
        int num = sc.nextInt();
        int absValue = (num < 0) ? -num : num;
        System.out.println("The absolute value is: " + absValue);   
        sc.close();
    }
    
}
