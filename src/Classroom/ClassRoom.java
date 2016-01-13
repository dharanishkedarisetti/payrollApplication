package Classroom;
import java.util.List;
import java.util.Vector;

public class ClassRoom {
	private int Capacity;
	private List<Teacher> teachers = new Vector<Teacher>();
	private List<Student> students = new Vector<Student>();
	
	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity){
		this.Capacity=capacity;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void addTeachers(Teacher teacher) {
		this.teachers.add(teacher);
		
	}

	public void addStudents(Student student) {
		this.students.add(student);
	}
	public List<Student> getStudents() {
		return this.students;
	}
	

}
