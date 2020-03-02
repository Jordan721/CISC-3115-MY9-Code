public class program{
	public static void main(String[] args){


		Student person = new Student();

		person.first = "Ari";

		person.last = "M";

		person.exam = 85;

		person.letter = calculateGrade(person.exam);

		printStudent(person);
	}
}