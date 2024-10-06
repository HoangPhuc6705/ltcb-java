package Ex7student;

public class student {
	String name;
	int student_id;
	public student(String name, int student_id) {
		this.name = name;
		this.student_id = student_id;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.student_id;
	}
}
