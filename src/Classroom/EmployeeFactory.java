package Classroom;

public class EmployeeFactory {
	public IEmployee addEmployee(String value,String Info){
		IEmployee employee =null;
		if(value.matches("Student")){
			employee = new Student(Info);
		}
		else if(value.matches("Teacher")){
			employee = new Teacher(Info);
	
		}
		else if(value.matches("Staff")){
			employee = new Staff(Info);
	
		}
		else if(value.matches("Executive")){
			employee = new Executive(Info);
	
		}
		else if(value.matches("Volunteer")){
			employee = new Volunteer(Info);
	
		}
		return employee;
	}
        
    public IEmployee addEmployee(String Info){
        String[] parts =Info.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        return this.addEmployee(parts[8], Info);
    }
        
	

}
