package assignment.assignment1;

public class Course {
	int id;
	String name;
	double fees;
	public Course(int id, String name, double fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	

}


