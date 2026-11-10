package Unit1.U1T11;
import java.util.Scanner;
public class mainLab2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
System.out.print("Enter first string: ");
String prevStr = scanner.nextLine();
int points = 0;
int wrdCt = 1;
int increase = 0;
while (points < 50) {
    increase = 0;
    int initialPoints = points;
    System.out.print("Enter another string: ");
    String currStr = scanner.nextLine();

    if (currStr.compareTo(prevStr) > 0) {
        points += 2;
    } else if (currStr.compareTo(prevStr) < 0) {
        points -= 5;
    } else {
    points -= 10;
    }

    int ind1 =  prevStr.length();
    String sub1 = prevStr.substring((ind1-2));
    String sub2 = currStr.substring(0,2);
    if (sub1.equals(sub2)) {
        points += 5;
    }

    String sub3 = prevStr.substring(0,1);
    if (currStr.contains(sub3)) {
        points += 3;
    }
    
    increase = points - initialPoints;
    wrdCt += 1;    
    prevStr = currStr;  
    System.out.println("Your current score is : " + points + "\nYou gained " + increase + " points with this word!");
}   
    System.out.println("You used " + wrdCt + " words!");
    if(wrdCt <= 6){
        System.out.println("That's the best you can get!");
    } else{
        System.out.println("Try again for less words!");
    }

scanner.close();
}
}

