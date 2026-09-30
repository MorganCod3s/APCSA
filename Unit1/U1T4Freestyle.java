package Unit1;
import java.util.Scanner;
public class U1T4Freestyle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println("Hi there, what's your name?");
    String name = scan.nextLine();
    System.out.println("Welcome " + name + "!");
    
    System.out.println("Enter a value for x:");
    Double x = scan.nextDouble();
    System.out.println("Enter a value for y:");
    int y = scan.nextInt();

    x *= 3;
    y /= x;
    y++;
    y++;
    x %= y;
    x += 2;
    y -= 5;
    x--;

    if (x==y) {
        System.out.println("Your numbers are equal.");
    }
    else if (x < y) {
        System.out.println("x is less than y.");
    }
    else {
        System.out.println("x is more than y.");
    }

    System.out.println("Your x is: " + x);
    System.out.println("Your y is: " + y);
    scan.close();

}
    
}
