package Unit1.U1T11;

public class FreestyleU1L12 {
    public static void main(String[] args) {
        double num1 =  Math.random();
        System.out.println(num1);
        double num2 =  Math.random();
        System.out.println(num2);
        double num3 =  Math.random();
        System.out.println(num3);
        double num4 =  Math.random();
        System.out.println(num4);
        double num5 =  Math.random() * 65;
        System.out.println(num5);
        double num6 =  Math.random() * 75 + 25;
        System.out.println(num6);
        double randomNum =  Math.random() * 35 + 50;
        System.out.println(randomNum);
 
 for (int i = 0; i < 100; i++) {
  double randomNum2 =  Math.round((int)(Math.random() * 36) + 50);
  System.out.println(randomNum2);
}

    }
}
