package Unit2.U2T4;

public class whileloop {
     public static void main(String[] args) {
        
    int a = 5;          
int b = 20;
while (a < 20 && b > 0) {
  a++;
  b--;
  if (b > 5) {
    b /= 2;
  }
}
System.out.println("a = " + a);
System.out.println("b = " + b);


int x = 30;
int y = 10;
int z = 5;
System.out.println("x: " + x + ", y: " + y + ", z: " + z);

while ((y != 0) && (x / y >= 0)) {
  x += 2;
  y -= 2;
  if (x % z != 0) {
    z--;
  }
  System.out.println("x: " + x + ", y: " + y + ", z: " + z);
}


     /* int count = 5;
     while (count <= 10) {
       count--;
       System.out.println(count);
     } */

}
}