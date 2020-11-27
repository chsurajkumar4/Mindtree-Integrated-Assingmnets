package IntegratedAssingmentNumber46;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TicketBookingApp {
	
	static int noOfUserAtPresent = 0;
	
	public static void main(String[] args) {
		int flag = 0;
		 Scanner s = new Scanner(System.in);
		System.out.print("Enter the numbers of passengers :: ");
		int sizeOfArray=s.nextInt();
		Passenger passenger[] = new Passenger[sizeOfArray];
		TicketBookingApp TBA = new TicketBookingApp();
		//DisplayingCustomerDetails DCD=new DisplayingCustomerDetails();
		//InputUserDetails IUD=new InputUserDetails();
		int optionChoice = 0;
		do {
			
			System.out.print(
					"\n1->> Enter customer details\n2->> Book ticket\n3->> Display Customers\n4->> Exit\n   Choose the options::  ");
			while (!s.hasNextInt()) {
				String inp = s.next();
				System.out.print(inp + " !!!  This is not a valid option \n Enter a valid option ::");

			}
			optionChoice = s.nextInt();
			// flag=1;

			// System.out.println("Enter a valid integer value !!");
			// flag=0;

			switch (optionChoice) {
			case 1:
				//TBA.passengerDetails(passenger);
				TBA.passengerDetails(passenger);
				noOfUserAtPresent = noOfUserAtPresent + 1;
				break;
			case 2:
				TBA.TicketBooking(passenger);
				break;
			case 3:
				int flag1 = 0;
				int ch1 = 0;
				// while(flag1==0){
				Scanner s4 = new Scanner(System.in);

				System.out
						.print("\n\t1->>City Names\n\t2->>ID\n\t3->>Sorted Order\n\t4->>Exit Menu\n\tChoose option::");
				while (!s4.hasNextInt()) {
					String inp = s4.next();
					System.out.print(inp + " !!!  This is not a valid option \n Enter a valid option ::");

				}
				ch1 = s4.nextInt();

				switch (ch1) {
				case 1:
					Scanner sc5 = new Scanner(System.in);
					System.out.println("Enter city Name:");
					String city = sc5.nextLine();
					TBA.DisplayByAddress(city, passenger,noOfUserAtPresent);
					break;
				case 2:
					Scanner sc6 = new Scanner(System.in);
					System.out.println("Enter id no:");
					while (!sc6.hasNextInt()) {
						String inp = sc6.next();
						System.out.print(inp + " !!!  This is not a valid id \n Enter a valid id format ::");

					}
					int id = sc6.nextInt();
					TBA.DisplayById(id, passenger,noOfUserAtPresent);
					break;
				case 3:
					TBA.DisplayBySorting(passenger,noOfUserAtPresent);
					break;
				case 4:
					flag = 1;
					break;
				default:
					System.out.println(" No Such option available !!!");
					break;
				}
				

				break;
			case 4:
				return;

			default:
				continue;
			}
			
		}
		while (flag != 1 || noOfUserAtPresent==sizeOfArray); 
	}
	
	

	
	void TicketBooking(Passenger[] passenger) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		String source = "add", destination = "add";
		System.out.print("Enter id->> ");
		while (!s1.hasNextInt()) {
			String inp = s1.next();
			System.out.print(inp + " !!!  This is not an id  \n Enter a valid id format ::");

		}
		int id = s1.nextInt();
		System.out.print("Enter ph no->> ");
		String phno = s2.nextLine();
		Date date1 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String date = formatter.format(date1);
		
		int pdi=(date.charAt(3)-48)*10+(date.charAt(4)-48);
		int pmi=(date.charAt(0)-48)*10+(date.charAt(1)-48);
		int pyi=(date.charAt(6)-48)*1000+(date.charAt(7)-48)*100+(date.charAt(8)-48)*10+(date.charAt(9)-48);
		System.out.print("Enter the travel Date->> ");
		String tdate = s2.nextLine();
		//TicketValidation ticketValidation=new TicketValidation();
		int f = DateFormatValidation(tdate);
		if (f == 1) {
			
			int tdi=(tdate.charAt(0)-48)*10+(tdate.charAt(1)-48);
			int tmi=(tdate.charAt(3)-48)*10+(tdate.charAt(4)-48);
			int tyi=(tdate.charAt(6)-48)*1000+(tdate.charAt(7)-48)*100+(tdate.charAt(8)-48)*10+(tdate.charAt(9)-48);
			//TicketValidation dt = new TicketValidation();
			int diff = getPresentAndTravelDateDifference(pdi, pmi, pyi, tdi, tmi, tyi);
			while (source.equals(destination)) {
				Scanner s3 = new Scanner(System.in);
				System.out.print("Enter source->> ");
				source = s3.nextLine();
				System.out.print("Enter destination->> ");
				destination = s3.nextLine();

			}
			int flag = 0;
			for (int i = 0; i < noOfUserAtPresent; i++) {
				//System.out.println(diff+" "+passenger[i].getId()+" "+passenger[i].getPhNum());
				if (passenger[i].getId() == id && passenger[i].getPhNum().equals(phno) && diff <= 30 && diff > 0) {
					int j=i+1;
					System.out.println("Ticket booked " + j);
					flag = 1;
					break;
				}// else
					//System.out.print(
							//"Enter trhe date in proper format !!! Travel date should not be 30 days more than date of booking !!! ");
			}

			if (flag == 0) {
				System.out.println("Customer data not found !!!\n Register ur self in the database. ");
			}
		}
	}
	
	static int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	int DateFormatValidation(String tdate) {
		if (tdate.length() == 10) {
			if (Character.isDigit(tdate.charAt(0)) && Character.isDigit(tdate.charAt(1))
					&& Character.isDigit(tdate.charAt(3)) && Character.isDigit(tdate.charAt(4))
					&& Character.isDigit(tdate.charAt(6)) && Character.isDigit(tdate.charAt(7))
					&& Character.isDigit(tdate.charAt(8)) && Character.isDigit(tdate.charAt(9))
					&& tdate.charAt(2) == '/' && tdate.charAt(5) == '/') {
				int tdi=(tdate.charAt(0)-48)*10+(tdate.charAt(1)-48);
				int tmi=(tdate.charAt(3)-48)*10+(tdate.charAt(4)-48);
				int tyi=(tdate.charAt(6)-48)*1000+(tdate.charAt(7)-48)*100+(tdate.charAt(8)-48)*10+(tdate.charAt(9)-48);
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
	
	void passengerDetails(Passenger[] passenger) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.print("Enter id->> ");
		while (!s1.hasNextInt()) {
			String inp = s1.next();
			System.out.print(inp + " !!!  This is not an id  \n Enter a valid id format ::");

		}
		int id = s1.nextInt();
		System.out.print("Enter name->> ");
		String name = s2.nextLine();
		int flag1 = 0;
		int age = 0;
		while (flag1 == 0) {
			System.out.print("Enter age->> ");
			while (!s1.hasNextInt()) {
				String inp = s1.next();
				System.out.print(inp + " !!!  This is not a valid age \n Enter a valid age  ::");

			}
			age = s1.nextInt();
			if (age <= 100)
				flag1 = 1;
		}

		String phno = "";
		int flag = 0;
		while (flag == 0) {
			System.out.print("Enter ph no->> ");
			phno = s2.nextLine();
			if (phno.length() == 10) {
				for (int i = 0; i < phno.length(); i++) {
					if (Character.isDigit(phno.charAt(i)))
						flag = 1;
					else {
						flag = 0;
						System.out.println("Enter a valid ph no !!");
						break;
					}
				}
			}
		}
		System.out.print("Enter Address->> ");
		String add = s2.nextLine();
		System.out.println(id+""+age+name+phno+add);
		passenger[noOfUserAtPresent]=new Passenger(id,age,name,add,phno);
		
		

	}
	
	
	void DisplayByAddress(String city, Passenger[] passenger,int cnt) {
		String names[] = new String[cnt];
		int cnt1 = 0;
		for (int i = 0; i < cnt; i++) {
			if (passenger[i].getAddress().equals(city)) {
				names[cnt1] = passenger[i].getName();
				// System.out.println(p[i].name);
				cnt1 = cnt1 + 1;
			}
		}
		for (int j = 0; j < cnt1; j++) {
			System.out.println(names[j]);
		}
	}
	
	void DisplayById(int id, Passenger[] passenger,int cnt) {

		int fnd = 0;
		for (int i = 0; i < cnt; i++) {
			if (passenger[i].getId() == id) {
				System.out.println(passenger[i].getName());
				fnd = 1;
			}
		}
		if (fnd == 0)
			System.out.println("Not found !!!");
	}

	// #########################################################################################################################

	void DisplayBySorting(Passenger[] passenger,int cnt) {
		String snames[] = new String[cnt];

		for (int i = 0; i < cnt; i++) {

			snames[i] = passenger[i].getName();

		}
		String temp;
		for (int i = 0; i < snames.length; i++) {
			for (int j = i + 1; j < snames.length; j++) {
				if (snames[j].compareTo(snames[i]) < 0) {
					temp = snames[i];
					snames[i] = snames[j];
					snames[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < snames.length; i++) {
			System.out.print(snames[i] + " ");
		}
	}

}
