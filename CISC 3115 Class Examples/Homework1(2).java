public class Homework1{
	  public static void main(String[] args){
	  final int score = Integer.parseInt (args[0]);
      final char grade;
  
      // This makes 
        if (score >= 90) {
           grade = 'A';
       } else if (score >= 80) {
          grade = 'B';
        } else if (score >= 70) {
           grade = 'C';
       } else if (score >= 60) {
           grade = 'D';
       } else {
           grade = 'F';
       }
 
      // N.B.  All cases must be handled or analysis would yield
       // an error: "Variable grade may not have been initialized."

       System.out.println ("The grade is %c.%n", grade);
   }
 }