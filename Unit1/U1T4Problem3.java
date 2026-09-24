package Unit1;
import java.util.Scanner;
public class U1T4Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a 3-digit number: ");
        int num = scanner.nextInt();
        int digit1 = num/100;
        int digit2 = (num % 100)/10;
        int digit3 = (num % 100)%10;
        if (digit1 == 0) {
            System.out.println("The reverse of 0" + num + " is: " + digit3 + digit2 + digit1);
        } else {
        System.out.println("The reverse of " + num + " is: " + digit3 + digit2 + digit1);
        }
        scanner.close();
    }
    
}
