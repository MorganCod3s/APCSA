package Unit1.U1T6;

public class Student {
  private String name;
   private double gpa;
   private String grade;
   // constructor
   public Student(String studentName, double studentGPA, String StudentGrade) {
       name = studentName;
       gpa = studentGPA;
       grade = StudentGrade;
   }
   // method that introduces the Student
   public void intro() {
       System.out.println("Hello, my name is " + name);
   }
   // method that prints Student info
   public void printInfo() {
       System.out.println("Name: " + name);
       System.out.println("GPA: " + gpa);
       System.out.println("Grade: " + grade);
   }
   
}
