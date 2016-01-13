/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classroom;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author dhara
 */
public class EmployeeTask {
    
    ArrayList<IEmployee> employees;
    ArrayList<String> names= new ArrayList<String>();
    Employee employee=null;
    Employee temp;
    public EmployeeTask(ArrayList<IEmployee> employees){
        this.employees=employees;
    }
    
    public IEmployee searchEmployee(String name){
        String fname=null;
        String lname =null;
        if(name.contains(" ")){
            fname = name.split(" ")[0];
            lname =name.split(" ")[1];
            for(IEmployee emp : employees){
                temp=(Employee) emp;
                if(temp.getFirstName().contentEquals(fname)|| temp.getLastName().contentEquals(lname)){
                    employee =temp;
                    return employee;
                }
            
            }
        }
        else{
            for(IEmployee emp : employees){
                temp=(Employee) emp;
                if(temp.getFirstName().contentEquals(name)|| temp.getLastName().contentEquals(name)){
                    employee =temp;
                    return employee;
                }
                
            }
        }
        return employee;
    }
    
    public IEmployee searchEmployee(int empid){
        for(IEmployee emp : employees){
            temp=(Employee) emp;
            if(temp.getEmpID()==empid){
                employee =temp;
            }
        }
        return employee;
    }
    
    public ArrayList<String> getEmployeeNames(){
        for(IEmployee emp: employees){
            temp =(Employee) emp;
            names.add(temp.getFirstName()+" "+temp.getLastName());            
        }
        return names;
    }
    
    
}
