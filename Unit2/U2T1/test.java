package Unit2.U2T1;

public class test {
    public static void main(String[] args) {
    
   /* final int VOTING_AGE = 18;
   final int DRIVING_AGE = 16;
   int myAge = 17;

   boolean canVote = (myAge >= VOTING_AGE);
   boolean canDrive = (myAge >= DRIVING_AGE);
   System.out.println("I can vote: " + canVote);
   System.out.println("I can drive: " + canDrive);
   int yourAge = 18;
   boolean sameAge = myAge == yourAge;
   if (sameAge) {
      System.out.println("Same age");
   } else {
      System.out.println("Different age");
   }

   int num1 = 12;
   boolean isEven = false;
   if (num1 % 2 == 0) {
      isEven = true;
   }
   System.out.println(num1 + " is even: " + isEven);

   boolean weird = (num1 <= 15) != (yourAge > 20);
   System.out.println(weird);

   String n = "hi";
   if (n.equals("bye")) {
      n = "whatever";
   } else if (n.equals("hello")) {
      n = "however";
   }
   System.out.println(n); */

   // code segment A
/* int num = 10;
if (num > 5) {
  num--;
}
if (num > 7) {
  num *= 2;
}
if (num > 10) {
  num++;
}
if (num == 5) {
  num /= 3;
} else {
  num /= 4;
}
System.out.print(num); */

// code segment B
/* int num = 10;
if (num > 5) {
  num--;
} else if (num > 7) {
  num *= 2;
} else if (num > 10) {
  num++;
} else if (num == 5) {
  num /= 3;
} else {
  num /= 4;
}
System.out.print(num);
*/

/* int num = 10;
if (num > 5) {
  num--;
} else {
  num *= 2;
}
if (num > 10) {
  num++;
} else {
  num /= 3;
}
num /= 4;
System.out.print(num); */

/*int x = 10;
int y = 15;

if (x > 5) {
  x--;
  y += 3;
}
if (y >= 18) {
  x *= 2;
}
y = x % 3;
if (x == 9) {
  y = x;
}
System.out.println("x = " + x);
System.out.println("y = " + y);
*/
/* 
boolean x = false;
int y = 11;
String str = ""; // empty string
str += "a";
if (x) {    // if (x) is shorthand for: if (x == true)
  str += "b"; 
  if (y % 2 == 0) {
    str += "c";
  } else {
    str += "d";
  }
  str += "e";
} else {
  if (y < 10) {
    str += "x";
  }
  str += "f";
  if (y < 20) {
    str += "z";
  }
  if (y > 15) {
    str += "g";
  } else if (y > 10) {
    if (!x) {
      str += "h";
    }
    str += "i";
  } else if (y > 5) {
    str += "j";
  } else if (y > 0) {
    str += "k";
  } else {
    str += "m";
  }
  str += "n";
}
str += "p";
System.out.println(str);
*/
/*
int score = 83;
    String grade = "";  // initialize to empty string

    if (score >= 90) {
      grade = "A";
    }
    else if (score >= 80) {
      grade = "B";
    }
    else if (score >= 70) {
      grade = "C";
    }
    else if (score >= 60) {
      grade = "D";
    }
    else if (score < 60) {
      grade = "F";
    }
    System.out.println("Your grade is: " + grade);
*/
/*
int score = 83;
    String grade = "";

    if (score < 60) {
      grade = "F";
    }
    if (score >= 60) {
      grade = "D";
    }
    if (score >= 70) {
      grade = "C";
    }
    if (score >= 80) {
      grade = "B";
    }
    if (score >= 90) {
      grade = "A";
    }
    System.out.println(grade);
*/
/*
int score = 83;
    String grade = "";

    if (score < 60) {
      grade = "F";
    } else if (score >= 60) {
      grade = "D";
    } else if (score >= 70) {
      grade = "C";
    } else if (score >= 80) {
      grade = "B";
    } else {
      grade = "A";
    }
    System.out.println(grade); */

     /* int score = 85;
     String grade = "";
    if (score >= 90) {
      grade = "A";
    } else if (score >= 80){
      grade = "B";
    } else if (score >= 70) {
      grade = "C";
    } else if (score >= 60) {
      grade = "D";
    } else {
      grade = "F";
    }
    System.out.println(grade);

    */

    int x = 10;
    int y = x;
        if (x > 5) {
            if (x > 10) {
                y--;
            }
        } else {
            int z = x;
            if (y >= z) {
                z++;
            } else {
                z--;
            }
        }

}
}