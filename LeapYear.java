import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
			System.out.print("What is the year? ");
			Scanner in = new Scanner(System.in);
			int year=in.nextInt();
			boolean leapYear = isLeapYear(year);
			System.out.print(leapYear);

	}
	public static boolean isLeapYear (int year){
		boolean leapYear;
		if (year>1582 && year%4==0 && (year%100!=0||year%400==0))
		{leapYear = true;}
		else leapYear=false;
		return leapYear;
	}

}
