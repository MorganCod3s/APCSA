package Unit1.U1T11;
import java.util.Scanner;
public class StringTestLab2 {
    public static void main(String[] args) {
        
    /* String str1 = "Hello!";
String str2 = "Hello!";
System.out.println(str1.equals(str2));
String str3 = "hello!";
System.out.println(str1.equals(str3));

String str4 = "HELLO!";
System.out.println(str1.equals(str4));

String str5 = "Hello";
System.out.println(str1.equals(str5));

String str1 = "apple";
String str2 = "apple";
String str3 = "banana";
System.out.println(str1.equals(str2));
System.out.println(!str1.equals(str2));
System.out.println(str1.equals(str3));
System.out.println(!str1.equals(str3));
*/
Scanner scan = new Scanner(System.in);
System.out.print("Enter string 1: ");
String string1 = scan.nextLine();
System.out.print("Enter string 2: ");
String string2 = scan.nextLine();
if (string1.equals(string2)) {
    System.out.println("The strings are equal!");
} else {
    System.out.println("The strings are NOT equal!");
}
if (string1.compareTo(string2) < 0) {
    System.out.println(string1 + " comes before " +  string2 + " alphabetically");
} else if (string1.compareTo(string2) > 0) {
    System.out.println(string2 + " comes before " +  string1 + " alphabetically");
} else {
}
scan.close();

/*String str1 = "apple";
String str2 = "carrot";
String str3 = "grape";
String str4 = "kiwi";
String str5 = "grape";
String str6 = "grand";

System.out.println(str1.compareTo(str2));
System.out.println(str1.compareTo(str3));
System.out.println(str2.compareTo(str1));
System.out.println(str4.compareTo(str2));
System.out.println(str2.compareTo(str3));
System.out.println(str3.compareTo(str5));
System.out.println(str5.compareTo(str6));
*/
}
}
