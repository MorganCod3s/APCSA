package Unit2.U2T1;
import java.util.Scanner;

public class Runner {
   public static void main(String[] args) {
     // Tell the user to enter a question
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to the Magic 8 Ball!");
     System.out.print("Enter a yes-no question and I will answer it: ");
     String question = scan.nextLine();

     int ball = (int)(Math.random()*9)+1;
     if (ball == 1){
        System.out.println("It is certain");
     } 
     if (ball == 2) {
        System.out.println("Without a doubt");
     }
     if (ball == 3) {
        System.out.println("Yes");
     } 
     if (ball == 4) {
        System.out.println("Ask again later");
     }
     if (ball == 5) {
        System.out.println("Cannot predict now");
     }
     if (ball == 6) {
        System.out.println("Concentrate and ask again");
     }
     if (ball == 7) {
        System.out.println("Don't count on it");
     }
     if (ball == 8) {
        System.out.println("My reply is no");
     }
     if (ball == 9) {
        System.out.println("Very doubtful");
     } 
     scan.close();
}
}
