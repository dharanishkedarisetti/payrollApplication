package Classroom;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Timer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeSheet {
        private Date startDate;
	private Date endDate;
	private double hours;
	private double grossPay;
	
        public Date getStarttime() {
		return startDate;
	}
	public Date getEndtime() {
		return endDate;
	}
	public void setEndtime(Date endtime) {
        	this.endDate = endtime;
                Calendar cal = Calendar.getInstance();
                cal.setTime(endDate);
                cal.add(Calendar.DATE, -6);
                this.startDate = cal.getTime();
                
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getGrossPay() {
		return grossPay;
	}
	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}
        
	

}
