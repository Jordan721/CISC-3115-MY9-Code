public class StudentConstructors{
  private String first;
  private String last;
  private int exam;
  private char letter;

  public StudentConstructors(String first, String last, int exam) throws Exception{
    this.first = first;
    this.last = last;

    if(exam < 0){
      throw new Exception()
    }

    this.exam = exam;

    evaluateLetterGrade();

  }

  private void evaluateLetterGrade(){
    letter = exam >= 60? 'P' : 'F';
  }

  public String getFirstName(){ //static belongs to class not object
    return first;
  }

  public String getLastName(){
    return last;
  }

  public int getExamGrade(){
    return exam;
  }
}
