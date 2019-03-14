package ch04;

import java.util.Calendar;

public class CalendarExam {
public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH) + 1;
	int date = cal.get(Calendar.DATE);
	int lastDate = cal.getActualMaximum(Calendar.DATE);
	
	//달력의 날짜를 지정
	cal.set(2019, 2, 1);
	int dayOfweek = cal.get(Calendar.DAY_OF_WEEK);
	
	System.out.println("SU MO TU WE TH FR SA");
	System.out.println("====================");
	
	for(int i = 1; i < dayOfweek; i++) {
		System.out.print("   ");
	}
	for(int i = 1; i <= lastDate; i++) {
	}
	if(i < 10) {
		System.out.print("0" + i + "");
	dayOfweek++;
	if(dayOfweek % 7 == 0) {
		System.out.println();
	}
//	System.out.println(year);
//	System.out.println(month);
//	System.out.println(date);
//	System.out.println(dayOfweek);
//	System.out.println(date);
//
//	
}
}
}
