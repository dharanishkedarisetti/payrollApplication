package Classroom;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;

public abstract class Employee extends Person implements IEmployee{
	
    private Category category = null;
    private int empID = 0; 
    private EmployeeType employeeType = EmployeeType.Volunteer;
    private double Salary =0;
    private double Bonus =0;
    private Date BonusDate = null;
    private List<TimeSheet> timesheets= new ArrayList<TimeSheet>() ;


    public int getEmpID() {
            return empID;
    }

    public void setEmpID(int empID) {
            this.empID = empID;
    }

    public EmployeeType getEmployeeType() {
            return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
            this.employeeType = employeeType;
    }

    public Category getCategory() {
            return category;
    }

    public void setCategory(Category category) {
            this.category = category;
    }

    public double getSalary() {
            return Salary;
    }

    public void setSalary(double salary) {
            Salary = salary;
    }

    public double getBonus(){
        return Bonus;
    }
    public void setBonus(double bonus){
        this.Bonus=bonus;
    }
    public Date getBonusDate() {
            return BonusDate;
    }
    public void setBonusDate(Date bonusDate) {
            BonusDate = bonusDate;
    }
    public void addTimesheet(TimeSheet t){
    	t.setGrossPay(this.claculateGrossSalary(t));
    	timesheets.add(t);
    }
    public List<TimeSheet> getTimesheet(){
        return timesheets;
    }
    
    // general function being used whild uploading the timesheet
    public double claculateGrossSalary(TimeSheet t){
        double salary = 0;
/*        if(this.employeeType.equals(employeeType.Volunteer)){
                salary =0;
        }
        else if(this.category.equals(Category.hourly)){
            if(this.employeeType.equals(EmployeeType.Student)){
                if(t.getHours()>20){
                    salary=20*this.Salary+(t.getHours()-20)*1.5*salary;
                }
                else{
                    salary=t.getHours()*this.Salary;
                }
            }
            else{
                DateFormat formatter = new SimpleDateFormat("dd, MMM, yyyy", Locale.ENGLISH);
                try {
                    if(t.getEndtime().compareTo(formatter.parse("26, NOV, 2015"))<7){
                        if(t.getHours()>24){
                            salary=24*this.Salary+(t.getHours()-24)*1.5*salary;
                        }
                        else{
                            salary=t.getHours()*this.Salary;
                        }
                        salary=salary+16*this.Salary;
                    }
                    else{
                        if(t.getHours()>40){
                            salary=40*this.Salary+(t.getHours()-40)*1.5*salary;
                        }
                        else{
                            salary=t.getHours()*this.Salary;
                        }
                    }
                } catch (ParseException e) {
                        e.printStackTrace();
                }
            }
        }
        else if(this.category.equals(Category.salaried_bonus)){
                salary=(this.Salary/52);
                System.out.println(salary);

                if(this.Bonus>0&&t.getEndtime().after(BonusDate)&&t.getStarttime().before(BonusDate)){
                        salary=salary+this.Bonus;
                }

        }
        else if(this.category.equals(Category.salaried)){
                salary=(this.Salary/12);
                DateFormat formatter = new SimpleDateFormat("dd, MMM, yyyy", Locale.ENGLISH);
                
                try {
					if(t.getEndtime().compareTo(formatter.parse("26, NOV, 2015"))<7){
						salary=salary+16*this.Salary;
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        }
 */       return salary;
    }
// will use if uploading via the csv
    protected void setEmployeeType(String next) {
        if (next.equals("Executive")){
                this.employeeType=EmployeeType.Executive;
        }
        else if (next.equals("Staff")){
                this.employeeType=EmployeeType.Staff;

        }
        else if (next.equals("Student")){
                this.employeeType=EmployeeType.Student;
        }
        else if (next.equals("Volunteer")){
                this.employeeType=EmployeeType.Volunteer;
        }
    }
// will use if using the csv file
    protected void setCategory(String next) {
        if (next.equals("Hourly")){
                this.category=Category.hourly;
        }
        else if (next.equals("Salaried and Bonus")){
                this.category=Category.salaried_bonus;
        }
        else if (next.equals("Salaried")){
                this.category=Category.salaried;
        }		
    }
   

   

}
