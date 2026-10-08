package Unit1;

public class U1T5Lab1 {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
int minInt = Integer.MIN_VALUE;
System.out.println("max int = " + maxInt);
System.out.println("min int = " + minInt);
// add the following code:
int someBigPosNum = 2147483600;   // 47 less than max
int someBigNegNum = -2147483600;  // 48 greater than min
System.out.println("big pos num = " + someBigPosNum);
System.out.println("big neg num = " + someBigNegNum);
// add the following code:
someBigPosNum += 100;  // this will cause the value to exceed max
someBigNegNum -= 100;  // this will cause the value to go below min
System.out.println("updated big pos num = " + someBigPosNum);
System.out.println("updated big neg num = " + someBigNegNum);

/* double num1 = 4.8;
double num2 = 5.9;
System.out.println(num1 + num2);
System.out.println((int) num1 + num2);
System.out.println(num1 + (int) num2);
System.out.println((int) num1 + (int) num2);
System.out.println((int) (num1 + num2));

int num3 = 8;
int num4 = 9;
System.out.println(num3 + num4);
System.out.println((double) num3 + num4);
System.out.println(num3 + (double) num4);
System.out.println((double) num3 + (double) num4);
System.out.println((double) (num3 + num4));
*/
int a = 10;
int b = 15;
double y = 20.9;
double z = 25.4;
// add two lines of code below:
a = (int)y;
b = (int)z;
System.out.println("a = " + a);
System.out.println("b = " + b);

double price = 5.00;
int roundedPrice = (int)(price + 0.5) ;
System.out.println("roundedPrice = " + roundedPrice);

double num = -4.85;
int roundedNum = (int)(num - 0.5);
System.out.println("roundedNum = " + roundedNum);




double num1 = 18.24;
int roundedNum1 = (int)(num1 + 0.5) ;
System.out.println(roundedNum1);

double num2 = 212.5;
int roundedNum2 = (int)(num2 + 0.5);
System.out.println(roundedNum2);

double num3 = -5.3;
int roundedNum3 = (int)(num3 - 0.5) ;
System.out.println(roundedNum3);

double num4 = -25.77;
int roundedNum4 = (int)(num4 - 0.5);
System.out.println(roundedNum4);
}
}
