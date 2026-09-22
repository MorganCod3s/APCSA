package Unit1;
import java.util.Scanner;
public class U1T4Problem2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1, enter your name: ");
        String player1 = scanner.next();

        System.out.print("Enter your number: ");
        double num1 = scanner.nextDouble(); 
        
        System.out.print("Player 2, enter your name: ");
        String player2 = scanner.next(); 

        System.out.print("Enter your number: ");
        double num2 = scanner.nextDouble(); 

        if (num1 > num2) {
            System.out.println(player1 + "'s number is bigger!");
        } else if (num1 < num2) {
            System.out.println(player2 + "'s number is bigger!");
        } else {
            System.out.println("The numbers are equal!");
        }
        scanner.close();
    }
    
}
