public class Student{
	private String first;

    private String last;

    private int exam;

    private char letter;

    public Student(String first, String last, int exam)
    throws Exception 

    {
    	this.first = first;
    	this.last = last;

    	if(exam < 0)
    		throws new Exception();

    	this.exam = exam;

    	evaluateLetterGrade();
    }

    private void evaluateLetterGrade(){

    	letter = exam >=60? 'P' : 'F';
    }

}

    // fields

    // memeber variables

    // instence variables