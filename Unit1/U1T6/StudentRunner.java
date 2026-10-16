package Unit1.U1T6;

class StudentRunner {
   public static void main(String[] args) {
       Student Stud1 = new Student("Morgan", 4.0, "Junior");
       Stud1.intro();
       Stud1.printInfo();
       System.out.println();
       Student Stud2 = new Student("Krisha", 3.8, "Junior");
       Stud2.intro();
       Stud2.printInfo();
   }
}

