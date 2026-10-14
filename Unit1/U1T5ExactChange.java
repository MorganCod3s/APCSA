package Unit1;

import java.util.Scanner;

public class U1T5ExactChange {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an amount in dollars and cents: ");
        double num1 = scan.nextDouble(); 
        double num2 = num1 * 100;
        
        int quarters = (int)(num2 / 25); 
        num2 = num2 - (quarters * 25); 
        int dimes = (int)(num2 / 10); 
        num2 = num2 - (dimes * 10); 
        int nickels = (int)(num2 / 5); 
        num2 = num2 - (nickels * 5); 

        int pennies = (int)(num2 / 1); 
        num2 = num2 - (pennies * 1); 
        int coinNum = (int)(quarters + dimes + pennies + nickels); 

        System.out.println("The minimum number of coins is: " + coinNum); 
        System.out.println(quarters + " quarters"); 
        System.out.println(dimes + " dimes"); 
        System.out.println(nickels + " nickels"); 
        System.out.println(pennies + " pennies"); 
    scan.close();
    }
}
}
