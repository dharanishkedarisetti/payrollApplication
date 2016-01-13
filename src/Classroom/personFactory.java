package Classroom;

public class personFactory {
	
	
	public Iperson addperson(String value,String Info){
		Iperson person =null;
		if(value.matches("Student")){
			person = new Student(Info);
		}
		else if(value.matches("Teacher")){
			person = new Teacher(Info);
	
		}
		return person;
	}
	

}
