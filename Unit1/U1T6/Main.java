
import java.util.Scanner;
package Unit1.U1T6;
public void Main(String[] args) {
    ChatBot StudentGPT = new ChatBot("StudentGPT", 0);
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String yourName = myScanner.nextLine();
    StudentGPT.greeting(yourName);

    myScanner = new Scanner(System.in);
    System.out.print("Enter your favorite number: ");
    int yourNumber = myScanner.nextInt();
    StudentGPT.favoriteNumber(yourNumber);

    StudentGPT.weather();

    myScanner = new Scanner(System.in);
    System.out.print("Enter number of feet: ");
    int numFeet = myScanner.nextInt();
    double meter = StudentGPT.convertFeetToMeters(numFeet);
    System.out.println(numFeet + " feet to meters is " + meter + " meters ");

    myScanner = new Scanner(System.in);
    System.out.println("Enter number 1: ");
    int num1 = myScanner.nextInt();
    System.out.println("Enter number 2: ");
    int num2 = myScanner.nextInt();
    System.out.println("Enter number 3: ");
    int num3 = myScanner.nextInt();
    int result = StudentGPT.addNumbers(num1,num2,num3);
    System.out.println("The total is: " + result);

    String bye = StudentGPT.goodbye();
    System.out.print(bye);



}
