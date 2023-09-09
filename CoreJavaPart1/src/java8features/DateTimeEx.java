package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeEx {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(" Current Date :"+today);
		LocalDate firstDay=LocalDate.of(2023, Month.APRIL, 1);
		System.out.println(" Specified date :"+firstDay);
		LocalDate todayKolkata=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(" Current Date in IST :"+todayKolkata);
		LocalTime time=LocalTime.now();
		System.out.println(" Current time :"+time);
		LocalTime time1=LocalTime.of(12, 34);
		System.out.println(" Specified time :"+time1);
		LocalTime timeKolkata=LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(" Current time in IST :"+timeKolkata);
        LocalDateTime today1= LocalDateTime.now();
        System.out.println(" Current date time :"+today1);
        LocalDateTime specificDate=LocalDateTime.of(2023,Month.FEBRUARY,14,15,55,45,25);
        System.out.println(" Specified date and time :"+specificDate);
        LocalTime timeAmerica = LocalTime.now(ZoneId.of("America/Chicago"));
		System.out.println(" Current Time in IST="+timeAmerica);
	}

}
