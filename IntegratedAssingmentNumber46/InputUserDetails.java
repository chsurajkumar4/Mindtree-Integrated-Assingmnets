package IntegratedAssingmentNumber46;

import java.util.Scanner;

public class InputUserDetails {

	void passengerDetails(Passenger[] passenger,int cnt) {
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
		passenger[cnt]=new Passenger();
		passenger[cnt].setId(id);
		passenger[cnt].setAge(age);
		passenger[cnt].setName(name);
		passenger[cnt].setPhNum(phno);
		passenger[cnt].setAddress(add);
		

	}
}
