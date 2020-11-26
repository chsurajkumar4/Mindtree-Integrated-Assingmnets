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
		DisplayingCustomerDetails DCD=new DisplayingCustomerDetails();
		InputUserDetails IUD=new InputUserDetails();
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
				IUD.passengerDetails(passenger,noOfUserAtPresent);
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
					DCD.DisplayByAddress(city, passenger,noOfUserAtPresent);
					break;
				case 2:
					Scanner sc6 = new Scanner(System.in);
					System.out.println("Enter id no:");
					while (!sc6.hasNextInt()) {
						String inp = sc6.next();
						System.out.print(inp + " !!!  This is not a valid id \n Enter a valid id format ::");

					}
					int id = sc6.nextInt();
					DCD.DisplayById(id, passenger,noOfUserAtPresent);
					break;
				case 3:
					DCD.DisplayBySorting(passenger,noOfUserAtPresent);
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
				System.exit(0);

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
		String pd = Character.toString(date.charAt(3)) + Character.toString(date.charAt(4));
		int pdi = Integer.parseInt(pd);
		String pm = Character.toString(date.charAt(0)) + Character.toString(date.charAt(1));
		int pmi = Integer.parseInt(pm);
		String py = Character.toString(date.charAt(6)) + Character.toString(date.charAt(7))
				+ Character.toString(date.charAt(8)) + Character.toString(date.charAt(9));
		int pyi = Integer.parseInt(py);
		System.out.print("Enter the travel Date->> ");
		String tdate = s2.nextLine();
		TicketValidation ticketValidation=new TicketValidation();
		int f = ticketValidation.DateFormatValidation(tdate);
		if (f == 1) {
			String td = Character.toString(tdate.charAt(0)) + Character.toString(tdate.charAt(1));
			
			int tdi = Integer.parseInt(td);
			String tm = Character.toString(tdate.charAt(3)) + Character.toString(tdate.charAt(4));
			int tmi = Integer.parseInt(tm);
			String ty = Character.toString(tdate.charAt(6)) + Character.toString(tdate.charAt(7))
					+ Character.toString(tdate.charAt(8)) + Character.toString(tdate.charAt(9));
			int tyi = Integer.parseInt(ty);
			//TicketValidation dt = new TicketValidation();
			int diff = TicketValidation.getPresentAndTravelDateDifference(pdi, pmi, pyi, tdi, tmi, tyi);
			while (source.equals(destination)) {
				Scanner s3 = new Scanner(System.in);
				System.out.print("Enter source->> ");
				source = s3.nextLine();
				System.out.print("Enter destination->> ");
				destination = s3.nextLine();

			}
			int flag = 0;
			for (int i = 0; i < noOfUserAtPresent; i++) {
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
	
	
	
	
	

}
