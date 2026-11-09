package Unit1.U1T11;
import java.util.Scanner;
 public class StringTest {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
System.out.print("Enter first string: ");
String word1 = scanner.nextLine();
System.out.print("Enter second string: ");
String word2 = scanner.nextLine();
int lenWord1 = word1.length();
int lenWord2 = word2.length();
if (lenWord1 > lenWord2) {
    System.out.println(word1 + " is longer ");
} else if (lenWord1 < lenWord2) {
    System.out.println(word2 + " is longer ");
} else {
    System.out.println("Both strings have the same length");
}
   int ind1 = lenWord1/2;
String word1half1 = word1.substring(0, ind1);
String word1half2 = word1.substring(ind1);
System.out.println("First half: " + word1half1 + "\nSecond half : " + word1half2);
    int ind2 = lenWord2/2;
String word2half1 = word2.substring(0, ind2);
String word2half2 = word2.substring(ind2);
System.out.println("First half: " + word2half1 + "\nSecond half : " + word2half2);

int isIncluded = word1.indexOf(word2);
if (isIncluded == -1) {
    System.out.println(word2 + " is NOT found in " + word1);
} else {
    System.out.println(word2 + " is found in " + word1 + " at index " + isIncluded);
}
scanner.close();

/*    String str1 = "Hello!";  System.out.println(str1.length());
String str2 = " H e l l o ! ";
int len = str2.length();
System.out.println(len);

String str3 = "Is tax 8.5%?";
System.out.println(str3.length());

String str4 = "43";
int len2 = str4.length();
System.out.println(len2);

String str5 = "";
System.out.println(str5.length());

String str6 = "Cat says \"MEOW\"!";
System.out.println(str6.length());

String str7 = "\\\"\"\n\\\n";
System.out.println(str7.length());
*/
/* String str1 = "Hello";
String str2 = "it's October 5!";
int len2 = str1.length() + str2.length();
System.out.println(len2); */
/* String str1 = "Hello how are you today?";
String str2 = "you";
String str3 = "You";
System.out.println(str1.indexOf(str2));
System.out.println(str1.indexOf(str3));

String myString = "I love October!";
String oct = myString.substring(7,11);
System.out.println(oct);
String str4 = myString.substring(0,15);
System.out.println(str4); */

/* String origStr = "Hello how are you today?";

String str1 = origStr.substring(0, 13);
System.out.println(str1);

String str2 = origStr.substring(8, 11);
System.out.println(str2);

String str3 = origStr.substring(14, 15);
System.out.println(str3);

String str4 = origStr.substring(0, 1);
System.out.println(str4);

String str5 = origStr.substring(9, 10);
System.out.println(str5);

String str6 = origStr.substring(18, 23);
System.out.println(str6);

String str7 = origStr.substring(20, 24);
System.out.println(str7);

// String str8 = origStr.substring(10, 26);
//System.out.println(str8);

String str9 = origStr.substring(6,9);
System.out.println(str9);

String blah = "What's for dinner?";
String ugh = blah.substring(11,17);
System.out.println(ugh);
String ugh2 = blah.substring(11);
System.out.println(ugh2);
String ugh3 = blah.substring(11,18);
System.out.println(ugh3);

String yum = "What’s for dinner?";
String din = yum.substring(3, 12).substring(5, 7);
System.out.println(din);
String today = "THURSDAY!";
String x = today.substring(3, 7).substring(0, 3).substring(1, 3);
System.out.println(x);

*/

String tired = "I'm tired!";
String end = "Of substrings!";

String str0 = end.substring(3);
System.out.println(str0);

String str1 = tired.substring(4) + end.substring(3);
System.out.println(str1);

String str2 = tired.substring(9) + tired.substring(6);
System.out.println(str2);

String str3 = end.substring(0, 1) + " " + end.substring(1, 2);
System.out.println(str3);

}
}