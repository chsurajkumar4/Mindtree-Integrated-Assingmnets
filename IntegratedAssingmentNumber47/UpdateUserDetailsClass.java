package IntegratedAssingmentNumber47;

import java.util.Scanner;

public class UpdateUserDetailsClass {
	
	void UpdateUserDetails(BankUser[] bankuser,int totalbankusercount) {
		Scanner s4 = new Scanner(System.in);
		System.out.print("Enter the accno for the details to be updated->> ");
		while (!s4.hasNextLong()) {
			String inp = s4.next();
			System.out.print(inp + " !!!  This is not a valid option \n Enter a valid option ::");

		}
		long accno = s4.nextLong();
		int flag = 0;
		for (int i = 0; i < totalbankusercount; i++) {
			if (accno == bankuser[i].getAccNo() && bankuser[i].getValid() == 1) {
				Scanner s5 = new Scanner(System.in);
				System.out.print("Enter the name to be updated->> ");
				bankuser[i].setName(s5.nextLine());
				System.out.print("Enter the new address->> ");
				bankuser[i].setAddress(s5.nextLine());
				flag = 1;
			}
		}
		if (flag != 0) {
			System.out.print(" Data successfully updated !!! ");
		} else {
			System.out.print(" Account details not found !!! ");
		}
	}

}
