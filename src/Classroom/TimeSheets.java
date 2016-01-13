package Classroom;

import java.util.List;

public class TimeSheets {
	List<TimeSheet> timeSheets;
	
	public void addTimeSheet(TimeSheet t){
		timeSheets.add(t);
		
	}
	public void removeTimeSheet(TimeSheet t){
		timeSheets.remove(t);
	}
	public List<TimeSheet> getTimeSheets(){
		return this.timeSheets;
	}
	

}
