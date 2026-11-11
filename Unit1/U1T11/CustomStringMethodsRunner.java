package Unit1.U1T11;
public class CustomStringMethodsRunner{
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods(); 
    boolean bool = methods.longerThan("apple", 4);
System.out.println(bool);
bool = methods.longerThan("apple", 5);
System.out.println(bool);
bool = methods.longerThan("apple", 2);
System.out.println(bool);
bool = methods.longerThan("apple", 7);
System.out.println(bool);

System.out.println("");


String str2 = methods.funnyString("computer", 3);
System.out.println(str2);
str2 = methods.funnyString("computer", 0);
System.out.println(str2);
str2 = methods.funnyString("computer", 7);
System.out.println(str2);
str2 = methods.funnyString("apples", 1);
System.out.println(str2);


System.out.println("");


String str = methods.halvesReversed("computer");  //even # of letters
System.out.println(str);
str = methods.halvesReversed("computers");        //odd # of letters
System.out.println(str);
str = methods.halvesReversed("sky");
System.out.println(str);
str = methods.halvesReversed("weekend");
System.out.println(str);
str = methods.halvesReversed("an");
System.out.println(str);
str = methods.halvesReversed("I");
System.out.println(str);
str = methods.halvesReversed("see you soon");
System.out.println(str);
str = methods.halvesReversed("see you later!");
System.out.println(str);

System.out.println("");

String str3 = methods.pigLatin("computer");
System.out.println(str3);
str3 = methods.pigLatin("sky");
System.out.println(str3);
str3 = methods.pigLatin("Brooklyn");
System.out.println(str3);
str3 = methods.pigLatin("weekend");
System.out.println(str3);

System.out.println("");

String str4 = methods.removeCharacter("Halloween", 5);
System.out.println(str4);
str4 = methods.removeCharacter("Halloween", 0);
System.out.println(str4);
str4 = methods.removeCharacter("Halloween", 8);
System.out.println(str4);
str4 = methods.removeCharacter("Halloween", 9);
System.out.println(str4);
str4 = methods.removeCharacter("Halloween", 20);
System.out.println(str4);
str4 = methods.removeCharacter("Hi friend", 0);
System.out.println(str4);
str4 = methods.removeCharacter("Hi friend", 1);
System.out.println(str4);
str4 = methods.removeCharacter("Hi friend", 2);
System.out.println(str4);
str4 = methods.removeCharacter(" Hi friend", 0);
System.out.println(str4);
str4 = methods.removeCharacter("A", 0);
System.out.println(str4);
str4 = methods.removeCharacter("A ", 0);
System.out.println(str4);
str4 = methods.removeCharacter("A", 1);
System.out.println(str4);
str4 = methods.removeCharacter("A ", 1);
System.out.println(str4);

System.out.println("");

String str5 = methods.insertAt("ghost", "BOO!", "o");
System.out.println(str5);
str5 = methods.insertAt("ghost", "BOO!", "st");
System.out.println(str5);
str5 = methods.insertAt("ghost", "BOO!", "m");
System.out.println(str5);
str5 = methods.insertAt("spooooky!", "YIKES", "o");
System.out.println(str5);
str5 = methods.insertAt("happy birthday!", "18th", "y");
System.out.println(str5);
str5 = methods.insertAt("happy birthday!", "18th", "birthday");
System.out.println(str5);
str5 = methods.insertAt("happy birthday!", "18th", " ");
System.out.println(str5);
str5 = methods.insertAt("happy birthday!", " 18th", " ");
System.out.println(str5);
str5 = methods.insertAt("happy birthday!", "18th ", "bir");
System.out.println(str5);
str5 = methods.insertAt("happy birthday!", "18th", "!");
System.out.println(str5);
str5 = methods.insertAt("happy birthday!", "18th", "z");
System.out.println(str5);
str5 = methods.insertAt("a", "m", "a");
System.out.println(str5);
str5 = methods.insertAt("a", "m", "p");
System.out.println(str5);

System.out.println("");

String str6 = methods.endUp("It's Thursday", 3);
System.out.println(str6);
str6 = methods.endUp("hello friend", 3);
System.out.println(str6);
str6 = methods.endUp("hello friend!", 3);
System.out.println(str6);
str6 = methods.endUp("Shhhh! Be quiet", 3);
System.out.println(str6);
str6 = methods.endUp("Yes", 3);
System.out.println(str6);
str6 = methods.endUp("Yess", 3);
System.out.println(str6);
str6 = methods.endUp("Yesss", 3);
System.out.println(str6);
str6 = methods.endUp("no", 3);
System.out.println(str6);
str6 = methods.endUp("no!", 3);
System.out.println(str6);
str6 = methods.endUp("noo!", 3);
System.out.println(str6);
str6 = methods.endUp("noo!!", 3);
System.out.println(str6);
str6 = methods.endUp("ALREADY UPPERCASE", 3);
System.out.println(str6);
str6 = methods.endUp("hello friend", 1);
System.out.println(str6);
str6 = methods.endUp("hello friend", 6);
System.out.println(str6);
str6 = methods.endUp("hello friend", 20);
System.out.println(str6);

System.out.println("");

String str7 = methods.yellOrWhisper("Hello James!");
System.out.println(str7);
str7 = methods.yellOrWhisper("hello James!");
System.out.println(str7);
str7 = methods.yellOrWhisper("aBCDEFGHIJK");
System.out.println(str7);
str7 = methods.yellOrWhisper("Abcdefghijk");
System.out.println(str7);
str7 = methods.yellOrWhisper("B");
System.out.println(str7);
str7 = methods.yellOrWhisper("b");
System.out.println(str7);
str7 = methods.yellOrWhisper("IT'S SUNNY!");
System.out.println(str7);
str7 = methods.yellOrWhisper("it's rainy");
System.out.println(str7);


    }
}