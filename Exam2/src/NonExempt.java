/**
 * 
 * @author Jessica Parker
 * @version Exam 2
 * 			CSCI 202
 * 			October 16, 2018
 *
 */
public class NonExempt extends Employee {

	
	private int hourlyWage;
	private int hoursWorked;
	
	public NonExempt(String name, String idnum, int hourlyWage, int hoursWorked) {
		super(name, idnum);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public int getPay() {
		return (hourlyWage * hoursWorked);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		NonExempt ne = (NonExempt) obj;
		return hourlyWage == (ne.hourlyWage) && hoursWorked == (ne.hoursWorked);
	}
	
	@Override
	public String toString() {
		return super.toString() +   " Hourly Wage: " + hourlyWage + "/hr" + " Hours Worked: " + hoursWorked + "hrs" + " Current Pay: " + "$" + getPay();
	}

	

	
}
