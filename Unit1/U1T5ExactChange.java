package Unit1;

import java.util.Scanner;

public class U1T5ExactChange {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an amount in dollars and cents: ");
        double num1 = scan.nextDouble(); 
        double quarter = 0.25; 
        double dime = 0.10; 
        double nickel = 0.05; 
        double penny = 0.01; 

        
        int quarters = (int)(num1 / 0.25); 
        num1 = num1 - (quarters * quarter); 
        int dimes = (int)(num1 / 0.10); 
        num1 = num1 - (dimes * dime); 
        int nickels = (int)(num1 / 0.05); 
        num1 = num1 - (nickels * nickel); 
        System.out.println(num1); 
        int pennies = (int)(num1 / 0.01); 
        num1 = num1 - (pennies * penny); 
        int coinNum = (int)(quarters + dimes + pennies + nickels); 

        System.out.println("The minimum number of coins is: " + coinNum); 
        System.out.println(quarters + " quarters"); 
        System.out.println(dimes + " dimes"); 
        System.out.println(nickels + " nickels"); 
        System.out.println(pennies + " pennies"); 
    scan.close();
    }
}
