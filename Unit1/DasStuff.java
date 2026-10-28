package Unit1;
import java.util.Scanner;
public class DasStuff {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num = scan.nextInt();
        int biggestPower = 1;
        // Determines the greatest power of 2 lower or equal to your number
        while (biggestPower * 2 <= num) {
            biggestPower = biggestPower * 2;
        }

        int result = num - biggestPower; //gets rid of the numbers that come after biggest power
        int ans = 2 * result + 1; // eliminate the number after 1 and skip past the next number, so 2 numbers are bound to be "eliminated" each time we move forward. 

        System.out.println(ans);
        scan.close();
// the reason we remove biggest power is because we already know that the largest perfect possible power of 2 will yield us 1. We must find what is left over, then multiply by 2 to account for each number that is skipped as we eliminate one. Then, since 1 comes from the biggestPower of two, we add 1. 


    }
}
