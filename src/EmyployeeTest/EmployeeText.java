package EmyployeeTest;

import java.time.*;

class employee{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public employee(String n,double s,int year,int month,int day) {
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public LocalDate getHireDay() {
		return this.hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = this.salary*byPercent/100;
		this.salary += raise;
	}
	
	
}

public class EmployeeText {
	public static void main (String[] args ) {
		employee[] staff = new employee[3];
		staff[0] = new employee("qqq", 11111, 1999, 01, 12);
		staff[1] = new employee("aaa", 12345, 1995, 12, 30);
		staff[2] = new employee("qqq", 11111, 1989, 11, 05);
		
		for(employee i : staff) {
			i.raiseSalary(5);
		}
		
		for(employee i:staff) {
			System.out.println("name="+i.getName()+",saraly="+i.getSalary()+",hireday="+i.getHireDay());
		}
			
			
		
	}
}
