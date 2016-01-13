package Classroom;
import java.util.List;
import java.util.Vector;

public class Course {
	private String Name;
	private List<Teacher> Teachers=new Vector<Teacher>();
	private List<Student> Students=new Vector<Student>();
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<Teacher> getTeachers() {
		return Teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		Teachers = teachers;
	}
	public void addTeachers(Teacher teacher) {
		Teachers.add(teacher);
	}

	public List<Student> getStudents() {
		return Students;
	}
	public void addStudents(Student student) {
		Students.add(student);
	}

}
