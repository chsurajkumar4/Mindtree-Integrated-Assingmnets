package IntegratedAssingmentNumber46;

public class TicketValidation {
	
	static int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	int DateFormatValidation(String tdate) {
		if (tdate.length() == 10) {
			if (Character.isDigit(tdate.charAt(0)) && Character.isDigit(tdate.charAt(1))
					&& Character.isDigit(tdate.charAt(3)) && Character.isDigit(tdate.charAt(4))
					&& Character.isDigit(tdate.charAt(6)) && Character.isDigit(tdate.charAt(7))
					&& Character.isDigit(tdate.charAt(8)) && Character.isDigit(tdate.charAt(9))
					&& tdate.charAt(2) == '/' && tdate.charAt(5) == '/') {
				String td = Character.toString(tdate.charAt(0)) + Character.toString(tdate.charAt(1));
				int tdi = Integer.parseInt(td);
				String tm = Character.toString(tdate.charAt(3)) + Character.toString(tdate.charAt(4));
				int tmi = Integer.parseInt(tm);
				String ty = Character.toString(tdate.charAt(6)) + Character.toString(tdate.charAt(7))
						+ Character.toString(tdate.charAt(8)) + Character.toString(tdate.charAt(9));
				int tyi = Integer.parseInt(ty);
				if (isValidDateMonth(tdi, tmi, tyi)) {
					// System.out.println("Yes");
					return 1;
				} else {
					// System.out.println("No");
					return 0;
				}
			}
			return 0;
		}

		else {
			System.out.println("Date is not in a valid format !!!");
			return 0;
		}

	}
	
	static boolean isValidDateMonth(int d, int m, int y) {

		
		if (m < 1 || m > 12) {
			System.out.print("Invalif month !!! \n Enter Again :: ");
			return false;
		}
		if (d < 1 || d > 31) {
			System.out.print("Invalid date !!! \n Enter again ::");
			return false;
		}

		if (m == 2) {
			if (isLeap(y))
				return (d <= 29);
			else
				return (d <= 28);
		}

		if (m == 4 || m == 6 || m == 9 || m == 11)
			return (d <= 30);

		return true;
	}
	
	static boolean isLeap(int year) {

		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}
	static int countLeapYears(int y, int m) {
		int years = y;

		if (m <= 2) {
			years--;
		}

		return years / 4 - years / 100 + years / 400;
	}

	// ###########################################################################################################################

	static int getPresentAndTravelDateDifference(int pd, int pm, int py, int td, int tm, int ty) {

		int n1 = py * 365 + pd;

		for (int i = 0; i < pm - 1; i++) {
			n1 += monthDays[i];
		}

		n1 += countLeapYears(py, pm);

		int n2 = ty * 365 + td;
		for (int i = 0; i < tm - 1; i++) {
			n2 += monthDays[i];
		}
		n2 += countLeapYears(ty, tm);

		return (n2 - n1);
	}
	
}
