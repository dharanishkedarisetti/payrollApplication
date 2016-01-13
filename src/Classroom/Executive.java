package Classroom;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Executive extends Employee {
	

	public Executive(String Info) {
            
            String[] parts =Info.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
/*            Scanner scan = new Scanner(Info);
            scan.useDelimiter(",");
            scan.next();
            this.setFirstName(scan.next());
            this.setLastName(scan.next());
            this.setAddress(scan.next());
            this.setPhone(scan.next());
            this.setSalary(scan.nextDouble());
            this.setBonus(scan.nextDouble());
            this.setCategory(scan.next());
            this.setEmployeeType(scan.next());
            if(scan.hasNext()){
                DateFormat formatter = new SimpleDateFormat("dd'th' MMM, yyyy", Locale.ENGLISH);
                Date date;
                try {
                    date = formatter.parse(scan.next());
                    this.setBonusDate(date);
                } catch (ParseException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
  */        
            this.setEmpID(Integer.parseInt(parts[0]));
            this.setFirstName(parts[1]);
            this.setLastName(parts[2]);
            this.setAddress(parts[3]);
            this.setPhone(parts[4]);
            this.setSalary(Integer.parseInt(parts[5]));
            this.setBonus(Integer.parseInt(parts[6]));
            this.setCategory(parts[7]);
            this.setEmployeeType(parts[8]);
 
            if(!parts[9].isEmpty()){

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d'th' MMM, yyyy", Locale.ENGLISH);
		parts[9]=parts[9].substring(1, parts[9].length()-1);
		Date date = Date.from(LocalDate.parse(parts[9], formatter).atStartOfDay(ZoneId.systemDefault()).toInstant());
		System.out.println(date);
                this.setBonusDate(date);
            }
	}

	@Override
	public IEmployee getEmployee() {
            return this;
	}

    @Override
    public Iperson getPerson() {
            return (Iperson)this;
    }
    
    @Override
    public double claculateGrossSalary(TimeSheet t) {
        double wage=0;
        wage=(this.getSalary()/52);

        if(this.getBonus()>0&&t.getEndtime().after(this.getBonusDate())&&t.getStarttime().before(this.getBonusDate())){
                wage=wage+this.getBonus();
        }
        return wage;
    }

}
