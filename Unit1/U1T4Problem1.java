package Unit1;
import java.util.Scanner;
public class U1T4Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Welcome " + name + "!");

        System.out.print("Please enter the first integer: 3");
        double num1 = scanner.nextDouble(); 
        
        System.out.print("Please enter the second integer: ");
        double num2 = scanner.nextDouble(); 

        System.out.print("Please enter the third integer: ");
        double num3 = scanner.nextDouble(); 

        double avg = (num1 + num2 + num3)/3;

        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + avg);

        scanner.close();
    }
}
