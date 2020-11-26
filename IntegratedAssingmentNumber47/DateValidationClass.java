package IntegratedAssingmentNumber47;

public class DateValidationClass {
	
	static int max = 2020;
	static int min = 1900;

	static boolean isLeap(int year) {

		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}

	// ###############################################################################################################################3

	static boolean isValidDate(int d, int m, int y) {

		if (y > max || y < min)
			return false;
		if (m < 1 || m > 12)
			return false;
		if (d < 1 || d > 31)
			return false;

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

	// ################################################################################################################################

	int validatedate(String tdate) {
		if (tdate.length() == 10) {
			if (Character.isDigit(tdate.charAt(0)) && Character.isDigit(tdate.charAt(1))
					&& Character.isDigit(tdate.charAt(3)) && Character.isDigit(tdate.charAt(4))
					&& Character.isDigit(tdate.charAt(6)) && Character.isDigit(tdate.charAt(7))
					&& Character.isDigit(tdate.charAt(8)) && Character.isDigit(tdate.charAt(9))
					&& tdate.charAt(2) == '/' && tdate.charAt(5) == '/') {
				String td = Character.toString(tdate.charAt(0)) + Character.toString(tdate.charAt(1));
				//int td=tdate.charAt(0)-48;
				//int date=td*10+(tdate.charAt(0)-48);
				int tdi = Integer.parseInt(td);
				String tm = Character.toString(tdate.charAt(3)) + Character.toString(tdate.charAt(4));
				int tmi = Integer.parseInt(tm);
				String ty = Character.toString(tdate.charAt(6)) + Character.toString(tdate.charAt(7))
						+ Character.toString(tdate.charAt(8)) + Character.toString(tdate.charAt(9));
				int tyi = Integer.parseInt(ty);
				if (isValidDate(tdi, tmi, tyi)) {
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
			System.out.print("Date is not in a valid format !!! \nEnter again ::");
			return 0;
		}

	}

}
