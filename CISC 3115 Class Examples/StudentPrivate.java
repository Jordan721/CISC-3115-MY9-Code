public class StudentPrivate {

  private String first;
  private String last;
  private int exam;
  private char letter;

  public String getFirstName() { //static belongs to class not object
    return first;
  }

  public String getLastName() {
    return last;
  }

  public int getExamGrade() {
    return exam;
  }

  public void setFirstName(String first) {
    this.first = first;
  }

  public void setLastName(String last) {
    this.last = last;
  }

  public void setExamGrade(int e) {
    if (exam >= 0)
      this.exam = exam;
  }

  public void evaluateLetterGrade() {
    if (exam >= 60)
      letter = 'P';
    else
      letter = 'F';
  }

}
