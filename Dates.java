import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Dates {
	
static Scanner scanner = new Scanner(System.in);



public static void main(String[] args) {
int year1, year2, month1, month2, day1, day2;
scanner = new Scanner(System.in);


System.out.println("Enter your first date: ");
	year1 = scanner.nextInt();
	month1 = scanner.nextInt();
	day1 = scanner.nextInt();
	
	
	System.out.println("Enter in your second date: ");
	year2 = scanner.nextInt();
	month2 = scanner.nextInt();
	day2 = scanner.nextInt();
	
	LocalDate  date1 = LocalDate.of(year1, month1, day1);

	LocalDate date2 = LocalDate.of(year2, month2, day2);
	
	Period period = Period.between(date1, date2);
	
	System.out.println(period.getYears() + "Years: " + period.getMonths() + "Months: " + period.getDays() + "Days: ");
	
	
	
	}


}