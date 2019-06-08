package CalenderTest;

import java.time.*;



/**
 * @version 12.1
 * @author 超儿
 *
 */

public class CalenderTest {
	public static void main(String[] args) {
		LocalDate data = LocalDate.now();
		int month = data.getMonthValue();
		int today = data.getDayOfMonth();
		System.out.print("今天是"+month+"月");
		System.out.println(today+"号");
		
		data = data.minusDays(today - 1);
		System.out.println(data);//年-月-日
		DayOfWeek weekday = data.getDayOfWeek();
		int value = weekday.getValue();
		System.out.println(value+"月");
		
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for(int i=1;i<value;i++) {
			System.out.print("    ");
		}
		while (data.getMonthValue() == month) {
			System.out.printf("%3d",data.getDayOfMonth());
			if(data.getDayOfMonth() == today) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			data = data.plusDays(1);
			if(data.getDayOfWeek().getValue() == 1) {
				System.out.println();
			}
		}
		if(data.getDayOfWeek().getValue() != 1) {
			System.out.println();
		}
		
		
	}
}
